package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.bean.Score;

import java.util.List;

/**
 * (Score)表数据库访问层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:21
 */
@Mapper
public interface ScoreDao {

    /**
     * 通过用户ID查询摩力值使用列表
     *
     * @param customerId 主键
     * @return 实例对象
     */
    List<Score> queryAll(@Param("customerId")String customerId);


}