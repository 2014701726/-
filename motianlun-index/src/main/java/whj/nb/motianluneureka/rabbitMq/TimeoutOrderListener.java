package whj.nb.motianluneureka.rabbitMq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import whj.nb.motianluneureka.entity.Orders;
import whj.nb.motianluneureka.service.OrdersService;

import javax.annotation.Resource;

@Component
public class TimeoutOrderListener {

    @Resource
    private OrdersService ordersService;

    /**
     * 监听死信队列
     * @param orderId
     */
    @RabbitListener(queues = "delay_queue2")
    public void onMessage(String orderId){
        Orders orders = ordersService.queryById(orderId);
        if (orders.getIszf().equals("0")){
            //未支付，则修改订单状态为过期
            ordersService.updateById(orderId,2);
        }else {

            return;
        }
    }

}
