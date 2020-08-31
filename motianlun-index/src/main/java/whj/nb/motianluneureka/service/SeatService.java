package whj.nb.motianluneureka.service;

import whj.nb.motianluneureka.entity.Seat;

import java.util.List;

/**
 * (Seat)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 10:11:33
 */
public interface SeatService {

    /**
     * 通过ID查询单条数据
     *
     * @param seatId 主键
     * @return 实例对象
     */
    Seat queryById(String seatId);



    /**
     * 修改数据
     *
     * @param seat 实例对象
     * @return 实例对象
     */
    int update(Seat seat);

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<String> queryAllByState();


}