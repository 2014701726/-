package whj.nb.nbmanager.service;

import whj.nb.nbmanager.bean.Order;

import java.util.List;

public interface OrderService {
    Integer delOrder(String id);
    List<Order> allOrder();
}
