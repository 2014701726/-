package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.cache.CacheStrategy;
import whj.nb.motianluneureka.cache.RedisCacheHandler;
import whj.nb.motianluneureka.dao.GoodsDao;
import whj.nb.motianluneureka.entity.Goods;
import whj.nb.motianluneureka.entity.PageBean;
import whj.nb.motianluneureka.entity.Theme;
import whj.nb.motianluneureka.service.GoodsService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (Goods)表服务实现类
 *
 * @author makejava
 * @since 2020-08-25 10:21:36
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsDao goodsDao;
    @Resource
    private RedisCacheHandler redisCacheHandler;


    @Override
    public PageBean findAllByType(Integer goodCityId, String performanceTypeId) {
        String key = "goods_type_cityId_"+goodCityId+"_performanceTypeId_"+performanceTypeId;
        return redisCacheHandler.cache(key, PageBean.class, new CacheStrategy() {
            @Override
            public Object strategy() {
                PageBean pageBean = new PageBean();
                List<Goods> allByType = goodsDao.findAllByType(goodCityId, performanceTypeId);
                pageBean.setAllByType(allByType);
                return pageBean;
            }
        });


    }

    @Override
    public List<Goods> findAllByHot(Integer goodCityId) {
        return goodsDao.findAllByHot(goodCityId);
    }

    @Override
    public PageBean findAllByLove(Integer goodCityId) {
        String key = "goods_love_cityId_"+goodCityId;
        return redisCacheHandler.cache(key, PageBean.class, new CacheStrategy() {
            @Override
            public Object strategy() {
                PageBean pageBean = new PageBean();
                List<Goods> allByLove = goodsDao.findAllByLove(goodCityId);
                pageBean.setAllByLove(allByLove);
                return pageBean;
            }
        });
    }

    @Override
    public PageBean findAllByDiscount(Integer goodCityId) {
        String key = "goods_discount_cityId_"+goodCityId;
        return redisCacheHandler.cache(key, PageBean.class, new CacheStrategy() {
            @Override
            public Object strategy() {
                PageBean pageBean = new PageBean();
                List<Goods> allByDiscount = goodsDao.findAllByDiscount(goodCityId);
                pageBean.setAllByDiscount(allByDiscount);
                return pageBean;
            }
        });
    }

    @Override
    public PageBean findAllByTime(Integer goodCityId, String showTime, Integer limit) {
        String key = "goods_time_cityId_"+goodCityId+"_showTime_"+showTime+"_limit_"+limit;
        return redisCacheHandler.cache(key, PageBean.class, new CacheStrategy() {
            @Override
            public Object strategy() {
                PageBean pageBean = new PageBean();
                List<Goods> allByTime = goodsDao.findAllByTime(goodCityId, showTime, limit);
                pageBean.setAllByTime(allByTime);
                return pageBean;
            }
        });
    }

    @Override
    public Goods findByGoodId(String goodId) {
        return goodsDao.findByGoodId(goodId);
    }

}