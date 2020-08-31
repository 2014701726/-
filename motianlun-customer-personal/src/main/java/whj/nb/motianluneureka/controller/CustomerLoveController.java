package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.*;
import whj.nb.motianluneureka.entity.CustomerLove;
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
@CrossOrigin
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

    @RequestMapping(value = "/{customerLoveId}",method = RequestMethod.DELETE)
    public ResultVO del(@PathVariable("customerLoveId") String customerLoveId){
        try {
            boolean b = customerLoveService.deleteById(customerLoveId);
            if (b) {
                return new ResultVO(0, "del customerLove success", null);
            }else {
                return new ResultVO(1,"fail",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ResultVO save(@RequestBody CustomerLove customerLove){
        try {
            boolean b = customerLoveService.insert(customerLove);
            if (b) {
                return new ResultVO(0, "add customerLove success", null);
            }else {
                return new ResultVO(1,"fail",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

}