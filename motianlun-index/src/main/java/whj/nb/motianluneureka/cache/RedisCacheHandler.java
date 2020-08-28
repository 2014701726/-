package whj.nb.motianluneureka.cache;

import com.google.gson.Gson;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: wangJian
 * @create: 2020-07-29 20:04
 **/
@Repository
public class RedisCacheHandler {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 策略模式方法(起子把)
     * @return
     */
    public <T> T cache(String key,Class<T> tClass,CacheStrategy cacheStrategy){
        T strategy = null;
        Gson gson = new Gson();
        //避免跑的人和第二次访问的人也排队，所以需要在锁的外层再加一个判断
        //双重检测锁
        String json = stringRedisTemplate.boundValueOps(key).get();
        if (json == null || "".equals(json)) {
            //1、查询缓存
            synchronized (this) {
                json = stringRedisTemplate.boundValueOps(key).get();
                if (json == null || "".equals(json)) {
                    //3、缓存没有数据，则查询数据库
                    //此方法中放的就是访问数据库的内容
                    strategy = (T) cacheStrategy.strategy();
                    if(strategy instanceof List){
                        List list = (List) strategy;
                        if (list.isEmpty()) {//当缓存的值为空的时候，设置空值的过期时间
                            String toJson = gson.toJson(strategy);
                            stringRedisTemplate.boundValueOps(key).set(toJson,1, TimeUnit.HOURS);
                        } else { //不为空则正常缓存
                            String toJson = gson.toJson(strategy);
                            stringRedisTemplate.boundValueOps(key).set(toJson);
                        }
                    } else if (strategy == null ) { //当缓存的值为空的时候，设置空值的过期时间
                        //4、将数据库查询到的数据写入缓存
                        String toJson = gson.toJson(strategy);
                        stringRedisTemplate.boundValueOps(key).set(toJson,1, TimeUnit.HOURS);
                    } else {//不为空则正常缓存
                        String toJson = gson.toJson(strategy);
                        stringRedisTemplate.boundValueOps(key).set(toJson);
                    }
                    return strategy;
                }
            }
        }
        //2、缓存有数据，则直接返回给controller
        strategy = gson.fromJson(json, tClass);
        return strategy;
    }
}
