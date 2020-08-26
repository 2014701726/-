package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.*;
import whj.nb.motianluneureka.bean.Orders;
import whj.nb.motianluneureka.service.OrdersService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Orders)表控制层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:18
 */
@RestController
@CrossOrigin
@RequestMapping("orders")
public class OrdersController {
    /**
     * 服务对象
     */
    @Resource
    private OrdersService ordersService;

    @RequestMapping(value="list/{customerId}",method = RequestMethod.GET)
    public ResultVO list(@PathVariable("customerId") String customerId){
        try {
            List<Orders> ordersList = ordersService.queryAllByLimit(customerId,1, 5);
            return new ResultVO(0,"find orderList success",ordersList);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

    /**
     * 通过主键查询单条数据
     *
     * @param orderId 主键
     * @return 单条数据
     */
    @RequestMapping(value="/{orderId}",method = RequestMethod.GET)
    public ResultVO selectOne(@PathVariable("orderId")String orderId) {
        try {
            Orders orders = ordersService.queryById(orderId);
            return new ResultVO(0,"find order success",orders);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

    /**
     * 通过主键删除单条数据
     *
     * @param orderId
     * @return
     */
    @RequestMapping(value="/{orderId}",method = RequestMethod.DELETE)
    public ResultVO deleteOrder(@PathVariable("orderId")String orderId){
        try {
            boolean b = ordersService.deleteById(orderId);
            if(b){
                return new ResultVO(0,"delete order success",null);
            }else {
                return new ResultVO(1,"fail",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }

    }

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public ResultVO saveOrder(@RequestBody Orders orders){
        try {
            boolean b = ordersService.insert(orders);
            if(b){
                return new ResultVO(0,"save order success",null);
            }else {
                return new ResultVO(1,"fail",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

}