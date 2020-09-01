package whj.nb.nbmanager.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.nbmanager.bean.Order;
import whj.nb.nbmanager.service.Impl.OrderServiceImpl;
import whj.nb.nbmanager.service.OrderService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("order")
public class OrderController {
    @Resource
    private OrderServiceImpl orderService;

    @RequestMapping("allOrder")
    public ResultVO toAllOrder(){
        List<Order> orders = orderService.allOrder();
        System.out.println(orders);
        return new ResultVO(1,"success",orders);
    }

    @RequestMapping("/delOrder/{id}")
    public ResultVO toDelOrder(@PathVariable("id") String id){
        Integer integer = orderService.delOrder(id);
        return new ResultVO(1,"success",integer);
    }
}
