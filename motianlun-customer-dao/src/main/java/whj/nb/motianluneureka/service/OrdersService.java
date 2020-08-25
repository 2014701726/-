package whj.nb.motianluneureka.service;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.bean.Orders;

import java.util.List;

/**
 * (Orders)表服务接口
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:17
 */

public interface OrdersService {

    /**
     * 通过ID查询单条数据
     * @param orderId 主键
     * @return 实例对象
     */
    Orders queryById(String orderId);

    /**
     * 查询多条数据
     *
     * @param customerId 用户ID
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Orders> queryAllByLimit(String customerId,int offset, int limit);

    /**
     * 新增数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    boolean insert(Orders orders);


    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    boolean deleteById(String orderId);

}