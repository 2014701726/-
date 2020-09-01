package whj.nb.nbmanager.dao;


import whj.nb.nbmanager.bean.Order;

import java.util.List;

public interface OrderDao {
    Integer delOrder(String id);
    List<Order> allOrder();
}
