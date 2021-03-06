package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.SeatType;

import java.util.List;

/**
 * (SeatType)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 10:23:06
 */
@Mapper
public interface SeatTypeDao {



    /**
     * 通过实体作为筛选条件查询
     *
     *
     * @return 对象列表
     */
    List<SeatType> queryAll();



}