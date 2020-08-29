package whj.nb.motianluneureka.service.impl;

import com.google.gson.Gson;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.cache.CacheStrategy;
import whj.nb.motianluneureka.cache.RedisCacheHandler;
import whj.nb.motianluneureka.dao.SeatDao;
import whj.nb.motianluneureka.entity.Goods;
import whj.nb.motianluneureka.entity.PageBean;
import whj.nb.motianluneureka.entity.Seat;
import whj.nb.motianluneureka.service.SeatService;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * (Seat)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 10:11:33
 */
@Service("seatService")
public class SeatServiceImpl implements SeatService {
    @Resource
    private SeatDao seatDao;
    @Resource
    private RedisCacheHandler redisCacheHandler;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 通过ID查询单条数据
     *
     * @param seatId 主键
     * @return 实例对象
     */
    @Override
    public Seat queryById(String seatId) {
        return this.seatDao.queryById(seatId);
    }


    /**
     * 修改数据
     *
     * @param seat 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Seat seat) {
        String[] split = seat.getSeat().split(",");
        int j = 0;
        synchronized (this) {
            for (String s : split) {
                String key = "seat_" + s;
                Gson gson = new Gson();
                //避免跑的人和第二次访问的人也排队，所以需要在锁的外层再加一个判断
                //双重检测锁
                String json = stringRedisTemplate.boundValueOps(key).get();
                if (json == null || "".equals(json)) {
                    //1、查询缓存
                    synchronized (this) {
                        json = stringRedisTemplate.boundValueOps(key).get();
                        if (json == null || "".equals(json)) {
                            j = 1;
                        }
                    }
                } else {
                    //2、缓存有数据，则直接返回给controller
                    return 2;
                }

            }
        }
        if (j == 1) {

            for (String s : split) {
                String key = "seat_" + s;
                Gson gson = new Gson();
                Seat seat1 = seatDao.queryById(s);
                if (seat1 instanceof List) {
                    List list = (List) seat1;
                    if (list.isEmpty()) {//当缓存的值为空的时候，设置空值的过期时间
                        String toJson = gson.toJson(seat1);
                        stringRedisTemplate.boundValueOps(key).set(toJson, 1, TimeUnit.HOURS);
                    } else { //不为空则正常缓存
                        String toJson = gson.toJson(seat1);
                        stringRedisTemplate.boundValueOps(key).set(toJson);
                    }
                } else if (seat1 == null) { //当缓存的值为空的时候，设置空值的过期时间
                    //4、将数据库查询到的数据写入缓存
                    String toJson = gson.toJson(seat1);
                    stringRedisTemplate.boundValueOps(key).set(toJson, 1, TimeUnit.HOURS);
                } else {//不为空则正常缓存
                    String toJson = gson.toJson(seat1);
                    stringRedisTemplate.boundValueOps(key).set(toJson);
                }
            }
            String send = "";
            for (String s1 : split) {
                send+="\""+s1+"\",";
            }
            send = send.substring(0, send.length()-1 );
            seat.setSeat(send);
            seatDao.update(seat);
        }
        return j;

    }

    @Override
    public List<String> queryAllByState() {
        return seatDao.queryAllByState();
    }


}