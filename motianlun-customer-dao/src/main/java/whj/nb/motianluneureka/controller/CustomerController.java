package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.motianluneureka.entity.Customer;
import whj.nb.motianluneureka.config.AliyunConfig;
import whj.nb.motianluneureka.service.CustomerService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;

/**
 * (Customer)表控制层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:14
 */
@RestController
@RequestMapping("customer")
public class CustomerController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerService customerService;

    private String code;

    @RequestMapping("/{telnum}/{msg}")
    public ResultVO login(@PathVariable("telnum") String telnum,@PathVariable("msg") String msg){
        try {
            if (msg.equals(code)) {
                return new ResultVO(0, "login success", null);
            }else {
                return new ResultVO(1,"fail",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }


    @RequestMapping("/{telnum}")
    public ResultVO sendCode(@PathVariable("telnum") String telnum){
        try {
            AliyunConfig aliyunConfig = new AliyunConfig();
            Customer customer = customerService.queryById(telnum);
            if(customer!=null){
                code = aliyunConfig.login(telnum);
                return new ResultVO(0,"send login code",null);
            }else {
                String code = aliyunConfig.register(telnum);
                Customer customer1 = new Customer();
                customer1.setCustomerId(System.currentTimeMillis()+"");
                customer1.setCustomerPhone(telnum);
                customerService.insert(customer1);
                return new ResultVO(0,"send register code",null);
            }

        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }

    }

}