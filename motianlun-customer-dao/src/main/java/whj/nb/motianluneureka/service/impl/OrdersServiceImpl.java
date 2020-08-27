package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.dao.OrdersDao;
import whj.nb.motianluneureka.entity.Orders;
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
        Orders orders = this.ordersDao.queryById(orderId);
        String ordersTakerPhone = orders.getTakerPhone();
        String hidePhone = ordersTakerPhone.substring(0, 3) + "****" + ordersTakerPhone.substring(ordersTakerPhone.length() - 4, ordersTakerPhone.length());
        orders.setTakerPhone(hidePhone);
        return orders;
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<Orders> queryAll(String customerId) {
        return this.ordersDao.queryAll(customerId);
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