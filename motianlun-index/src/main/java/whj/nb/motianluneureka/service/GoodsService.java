package whj.nb.motianluneureka.service;

import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.Goods;
import whj.nb.motianluneureka.entity.PageBean;

import java.util.Date;
import java.util.List;

/**
 * (Goods)表服务接口
 *
 * @author makejava
 * @since 2020-08-25 10:21:36
 */
public interface GoodsService {

    /**
     * 类型查
     *
     * @param goodCityId
     * @param performanceTypeId
     * @return
     */
    PageBean findAllByType(Integer goodCityId, String performanceTypeId);

    /**
     * 根据城市ID查热门
     *
     * @param goodCityId
     * @return
     */
    List<Goods> findAllByHot(Integer goodCityId);

    /**
     * 通过城市ID查人气排行前五
     *
     * @param goodCityId
     * @return
     */
    PageBean findAllByLove(Integer goodCityId);

    /**
     * 通过城市ID查折扣前五
     *
     * @param goodCityId
     * @return
     */
    PageBean findAllByDiscount(Integer goodCityId);

    /**
     * 根据时间查
     *
     * @param goodCityId
     * @param showTime
     * @param limit
     * @return
     */
    PageBean findAllByTime(Integer goodCityId, String showTime, Integer limit);

}