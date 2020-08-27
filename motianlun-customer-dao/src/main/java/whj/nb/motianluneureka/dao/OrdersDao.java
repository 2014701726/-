package whj.nb.motianluneureka.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import whj.nb.motianluneureka.entity.Orders;

import java.util.List;

/**
 * (Orders)表数据库访问层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:16
 */
@Mapper
public interface OrdersDao {

    /**
     * 通过ID查询单条数据
     * @param orderId 主键
     * @return 实例对象
     */
    Orders queryById(String orderId);



    /**
     * 通过用户ID作为筛选条件查询
     *
     * @param customerId 用户ID
     * @return 对象列表
     */
    List<Orders> queryAll(String customerId);

    /**
     * 新增数据
     *
     * @param orders 实例对象
     * @return 影响行数
     */
    int insert(Orders orders);


    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 影响行数
     */
    int deleteById(String orderId);

}