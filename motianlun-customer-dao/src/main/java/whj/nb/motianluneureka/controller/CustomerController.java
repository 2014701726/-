package whj.nb.motianluneureka.controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.motianluneureka.entity.Customer;
import whj.nb.motianluneureka.config.AliyunConfig;
import whj.nb.motianluneureka.service.CustomerService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * (Customer)表控制层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:14
 */
@RestController
@CrossOrigin
@RequestMapping("customer")
public class CustomerController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerService customerService;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    private String code;


    @RequestMapping("/{telnum}")
    public ResultVO sendCode(@PathVariable("telnum") String telnum){
        try {
            AliyunConfig aliyunConfig = new AliyunConfig();
            Customer customer = customerService.queryById(telnum);
            if(customer!=null){
                code = aliyunConfig.login(telnum);
                return new ResultVO(0,"send login code",null);
            }else {
                 code = aliyunConfig.register(telnum);
                return new ResultVO(0,"send register code",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }

    }

    @RequestMapping("/{telnum}/{msg}")
    public ResultVO login(@PathVariable("telnum") String telnum,@PathVariable("msg") String msg){
        try {
            Customer customer = customerService.queryById(telnum);
            if(customer==null){
                customer.setCustomerId(System.currentTimeMillis()+"");
                customer.setCustomerPhone(telnum);
                customerService.insert(customer);
            }
            if (msg.equals(code)) {
                String customerPhone = customer.getCustomerPhone();
                String customerId = customer.getCustomerId();
                stringRedisTemplate.opsForValue().set(customerPhone,customerId,36000, TimeUnit.SECONDS);
                return new ResultVO(0, "login success", null);
            }else {
                return new ResultVO(1,"fail",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

}