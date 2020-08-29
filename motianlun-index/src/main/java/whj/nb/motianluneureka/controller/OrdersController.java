package whj.nb.motianluneureka.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.*;
import whj.nb.motianluneureka.entity.Orders;
import whj.nb.motianluneureka.entity.Seat;
import whj.nb.motianluneureka.service.OrdersService;
import whj.nb.motianluneureka.service.SeatService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;

/**
 * (Orders)表控制层
 *
 * @author makejava
 * @since 2020-08-27 09:49:57
 */
@CrossOrigin
@RestController
@RequestMapping("orders")
public class OrdersController {
    /**
     * 服务对象
     */
    @Resource
    private OrdersService ordersService;
    @Resource
    private SeatService seatService;
    @Resource
    private AmqpTemplate amqpTemplate;

    @RequestMapping("add")
    public ResultVO orderAdd(@RequestBody Orders orders){
        ResultVO<Orders> resultVO = new ResultVO<>();
        try {
            Seat seat = new Seat();
            seat.setSeat(orders.getSeat());
            int i = seatService.update(seat);
            if (i == 1){
                ordersService.insert(orders);
                //下单成功后把订单号发送到MQ队列
                amqpTemplate.convertAndSend("delay_exchange","k1",orders.getOrderId());
                resultVO.setCode(0);
                resultVO.setMsg("订单提交成功");
                resultVO.setT(orders);
            }
            if (i == 2){
                resultVO.setCode(1);
                resultVO.setMsg("订单提交失败，可能座位已被抢");
            }
        }catch (Exception e){
            e.printStackTrace();
            resultVO.setCode(2);
            resultVO.setMsg("网络异常，请刷新");
        }
        return resultVO;
    }

    @RequestMapping("pay/{orderId}")
    public ResultVO pay(@PathVariable String orderId){
        ResultVO<Object> resultVO = new ResultVO<>();
        try {
            ordersService.updateById(orderId,1);
            resultVO.setCode(0);
            resultVO.setMsg("订单修改为已支付");
        }catch (Exception e){
            resultVO.setCode(1);
            resultVO.setMsg("订单修改支付异常");
        }
        return resultVO;
    }
}