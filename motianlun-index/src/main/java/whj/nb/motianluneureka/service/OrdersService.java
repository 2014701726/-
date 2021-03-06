package whj.nb.motianluneureka.service;

import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.Orders;

import java.util.List;

/**
 * (Orders)表服务接口
 *
 * @author makejava
 * @since 2020-08-27 09:49:56
 */
public interface OrdersService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    Orders queryById(String orderId);



    /**
     * 新增数据
     *
     * @param orders 实例对象
     *
     */
    void insert(Orders orders);

    /**
     * 通过订单ID修改订单状态
     * @param orderId
     * @param k
     */
    void updateById(@Param("orderId") String orderId, @Param("k") Integer k);

}