package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.*;
import whj.nb.motianluneureka.bean.Coupon;
import whj.nb.motianluneureka.bean.CustomerLove;
import whj.nb.motianluneureka.service.CustomerLoveService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CustomerLove)表控制层
 *
 * @author ChanzZ
 * @since 2020-08-25 14:06:50
 */
@RestController
@RequestMapping("customerLove")
public class CustomerLoveController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerLoveService customerLoveService;



    @RequestMapping(value = "/{customerId}",method = RequestMethod.GET)
    public ResultVO queryAll(@PathVariable("customerId") String customerId){
        try {
            List<CustomerLove> customerLoveList = customerLoveService.queryAll(customerId);
            return new ResultVO(0,"find customerLoveList success",customerLoveList);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

}