package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.dao.OrdersDao;
import whj.nb.motianluneureka.bean.Orders;
import whj.nb.motianluneureka.service.OrdersService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Orders)表服务实现类
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:18
 */
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersDao ordersDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderId 主键
     * @return 实例对象
     */
    @Override
    public Orders queryById(String orderId) {
        return this.ordersDao.queryById(orderId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Orders> queryAllByLimit(String customerId,int offset, int limit) {
        return this.ordersDao.queryAllByLimit(customerId,offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Orders orders) {
        return this.ordersDao.insert(orders)>0;
    }



    /**
     * 通过主键删除数据
     *
     * @param orderId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String orderId) {
        return this.ordersDao.deleteById(orderId) > 0;
    }
}