package whj.nb.motianluneureka.controller;

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

    @RequestMapping("add")
    public ResultVO orderAdd(@RequestBody Orders orders){
        ResultVO<Orders> resultVO = new ResultVO<>();
        try {
            Seat seat = new Seat();
            seat.setSeat(orders.getSeat());
            int i = seatService.update(seat);
            if (i == 1){
                ordersService.insert(orders);
                resultVO.setCode(0);
                resultVO.setMsg("订单提交成功");
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

}