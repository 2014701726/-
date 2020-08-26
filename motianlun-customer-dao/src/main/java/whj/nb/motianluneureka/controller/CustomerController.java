package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.motianluneureka.bean.Customer;
import whj.nb.motianluneureka.bean.CustomerLove;
import whj.nb.motianluneureka.config.AliyunConfig;
import whj.nb.motianluneureka.service.CustomerService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

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


    @RequestMapping("/{telnum}")
    public ResultVO login(@PathVariable("telnum") String telnum){
        try {
            AliyunConfig aliyunConfig = new AliyunConfig();
            Customer customer = customerService.queryById(telnum);
            if(customer!=null){
                aliyunConfig.login(telnum);
                return new ResultVO(0,"login success",customer);
            }else {
                aliyunConfig.register(telnum);
                Customer customer1 = new Customer();
                customer1.setCustomerId(System.currentTimeMillis()+"");
                customer1.setCustomerPhone(telnum);
                customerService.insert(customer1);
                return new ResultVO(0,"register success",customer1);
            }

        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }

    }

}