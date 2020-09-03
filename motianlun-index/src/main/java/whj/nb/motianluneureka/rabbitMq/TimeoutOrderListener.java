package whj.nb.motianluneureka.rabbitMq;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import whj.nb.motianluneureka.entity.Orders;
import whj.nb.motianluneureka.entity.Seat;
import whj.nb.motianluneureka.service.OrdersService;
import whj.nb.motianluneureka.service.SeatService;


import javax.annotation.Resource;


@Component
public class TimeoutOrderListener {

    @Resource
    private OrdersService ordersService;
    @Resource
    private SeatService seatService;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 监听死信队列
     *
     * @param orderId
     */
    @RabbitListener(queues = "delay_queue2")
    public void onMessage(String orderId) {
        Orders orders = ordersService.queryById(orderId);
        if (orders.getIszf().equals("0")) {
            System.out.println(orderId);
            //未支付，则修改订单状态为过期
            ordersService.updateById(orderId, 2);
            if (orders.getSeat() != null && orders.getSeat() != ""){
                //修改座位为未出售
                Seat seat = new Seat();
                seat.setSeat(orders.getSeat());
                seatService.update0(seat);
                //使Redis对应的key过期
                String[] split = orders.getSeat().split(",");

                for (String s : split) {
                    String key = "seat_" + s;
                    stringRedisTemplate.delete(key);
                }
            }
        }else {
            System.out.println(orderId);
        }
    }

}
