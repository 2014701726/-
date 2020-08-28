package whj.nb.motianluneureka.service.impl;

import org.springframework.stereotype.Service;
import whj.nb.motianluneureka.cache.RedisCacheHandler;
import whj.nb.motianluneureka.dao.OrdersDao;
import whj.nb.motianluneureka.entity.Orders;
import whj.nb.motianluneureka.service.OrdersService;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Orders)表服务实现类
 *
 * @author makejava
 * @since 2020-08-27 09:49:57
 */
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersDao ordersDao;
    @Resource
    private RedisCacheHandler redisCacheHandler;

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
     * 新增数据
     *
     * @param orders 实例对象
     * @return 实例对象
     */
    @Override
    public void  insert(Orders orders) {


        ordersDao.insert(orders);
    }



}