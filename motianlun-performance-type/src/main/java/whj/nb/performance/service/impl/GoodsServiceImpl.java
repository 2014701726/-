package whj.nb.performance.service.impl;

import whj.nb.performance.entity.Goods;
import whj.nb.performance.dao.GoodsDao;
import whj.nb.performance.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * (Goods)表服务实现类
 *
 * @author makejava
 * @since 2020-08-25 12:03:07
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;

    //查所有
    @Override
    public List<Goods> queryById(Integer cityId, String performanceTypeId,String time ,String condition) {

        List<Goods> goods = goodsDao.queryById(cityId, performanceTypeId,time ,condition);


        if(time == "weeked" || "weeked".equals(time)){
            List<Goods> find7Good =new ArrayList<>();
            for (Goods good : goods) {
//                System.out.println(1);
                Date gooddate = (Date) good.getShowTime();
                //把数据库时间转换为时间戳（时间戳是北京时间1970年01月01日08时00分00秒到现在的时间精确到时分秒）
                long time1 = gooddate.getTime();
                //获取当前时间 的 时间戳
                long l = System.currentTimeMillis();
                //结果为天数
                long t=(l-time1)/1000/60/60/24;
                t=Math.abs(t);
                if(t<7) {
//                    System.out.println(t);
                    //获取数据库具体时间如2020-8-25
                    String s = good.getShowTime().toString();
//                    System.out.println(s);
                    //数据库查到的数据到toweek中转换为1-7中的数
                    Integer weeknum = toWeek(s);
//                System.out.println(weeknum);
                    if (weeknum == 7) {
                        find7Good.add(good);
                        System.out.println(weeknum);

                    }
                }
            }
                return find7Good;
        }
        return goods;
    }

    @Override
    public List<Goods> queryAll() {
        return goodsDao.queryAllgg();
    }


    /**
     * 查询当周周日
     *
     * @return 当周周日
     */

    public static Integer GetWeek(String on){

        String [] week={
                "星期一",
                "星期二",
                "星期三",
                "星期四",
                "星期五",
                "星期六",
                "星期日"
        };
        int i;
        for(i=0;i<week.length;i++){

            if(week[i].equals(on)) {
//             System.out.println(i);
                return i+1;
            }
        }

        return 0;

    }

    public static Integer toWeek(String strdate){

//        System.out.println(strdate);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
        Date date = null;
        try {
            date = simpleDateFormat.parse(strdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat  formatWeek = new   SimpleDateFormat("EEEE");//星期几定义日期格式
        //把时间如2020-8-25转换为星期二
        String week=formatWeek.format(date);
//        System.out.println(week);
        //星期几转换为1-7的数字
        Integer weeknum = GetWeek(week);
//        System.out.println(weeknum);
        return weeknum;
    }













    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Goods> queryAllByLimit(int offset, int limit) {
        return this.goodsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    @Override
    public Goods insert(Goods goods) {
        this.goodsDao.insert(goods);
        return goods;
    }

    /**
     * 修改数据
     *
     * @param goods 实例对象
     * @return 实例对象
     */
    @Override
    public Goods update(Goods goods) {
        this.goodsDao.update(goods);
//        return this.queryById(goods.getGoodId());
        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param goodId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer goodId) {
        return this.goodsDao.deleteById(goodId) > 0;
    }
}