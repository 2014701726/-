package whj.nb.nbmanager.service.Impl;

import org.springframework.stereotype.Service;
import whj.nb.nbmanager.bean.Order;
import whj.nb.nbmanager.dao.OrderDao;
import whj.nb.nbmanager.service.OrderService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderDao orderDao;

    @Override
    public Integer delOrder(String id) {
        return orderDao.delOrder(id);
    }

    @Override
    public List<Order> allOrder() {
        return orderDao.allOrder();
    }
}
