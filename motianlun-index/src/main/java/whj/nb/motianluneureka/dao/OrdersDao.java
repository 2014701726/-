package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.Orders;

import java.util.List;

/**
 * (Orders)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-27 09:49:56
 */
@Mapper
public interface OrdersDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    Orders queryById(String orderId);




    /**
     * 通过实体作为筛选条件查询
     *
     * @param orders 实例对象
     * @return 对象列表
     */
    List<Orders> queryAll(Orders orders);

    /**
     * 新增数据
     *
     * @param orders 实例对象
     *
     */
    void insert(Orders orders);

    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 影响行数
     */
    int deleteById(String orderId);

    /**
     * 通过订单ID修改订单状态
     * @param orderId
     * @param k
     */
    void updateById(@Param("orderId") String orderId,@Param("k") Integer k);

}