package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.Seat;

import java.util.List;

/**
 * (Seat)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 10:11:33
 */
@Mapper
public interface SeatDao {

    /**
     * 通过ID查询单条数据
     *
     * @param seatId 主键
     * @return 实例对象
     */
    Seat queryById(String seatId);



    /**
     * 通过实体作为筛选条件查询
     *
     * @return list
     */
    List<String> queryAllByState();



    /**
     * 修改数据
     *
     * @param seat 实例对象
     * @return 影响行数
     */
    int update(Seat seat);

    /**
     * 修改数据
     *
     * @param seat 实例对象
     * @return 影响行数
     */
    int update0(Seat seat);



}