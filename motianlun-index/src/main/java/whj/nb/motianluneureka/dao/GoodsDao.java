package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.Goods;

import java.util.Date;
import java.util.List;

/**
 * (Goods)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-25 10:21:36
 */
@Mapper
public interface GoodsDao {


    /**
     * 通过实体作为筛选条件查询
     *
     * @param goods 实例对象
     * @return 对象列表
     */
    List<Goods> queryAll(Goods goods);

    /**
     * 通过城市ID和类型查
     *
     * @param goodCityId
     * @param performanceTypeId
     * @return
     */
    List<Goods> findAllByType(@Param("goodCityId") Integer goodCityId, @Param("performanceTypeId") String performanceTypeId);

    /**
     * 根据城市ID查热门
     *
     * @param goodCityId
     * @return
     */
    List<Goods> findAllByHot(Integer goodCityId);

    /**
     * 通过城市ID查人气前五
     *
     * @param goodCityId
     * @return
     */
    List<Goods> findAllByLove(Integer goodCityId);

    /**
     * 通过城市ID查折扣前五
     *
     * @param goodCityId
     * @return
     */
    List<Goods> findAllByDiscount(Integer goodCityId);

    /**
     * 根据时间查
     *
     * @param goodCityId
     * @param showTime
     * @param limit
     * @return
     */
    List<Goods> findAllByTime(@Param("goodCityId") Integer goodCityId, @Param("showTime") String showTime, @Param("limit") Integer limit);
}