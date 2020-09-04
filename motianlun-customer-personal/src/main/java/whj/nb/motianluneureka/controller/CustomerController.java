package whj.nb.motianluneureka.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.motianluneureka.config.CustomerVO;
import whj.nb.motianluneureka.entity.Customer;
import whj.nb.motianluneureka.config.AliyunConfig;
import whj.nb.motianluneureka.service.CustomerService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.Date;
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

    @RequestMapping("pay/{telnum}")
    public ResultVO send(@PathVariable("telnum") String telnum){
        try {
            AliyunConfig aliyunConfig = new AliyunConfig();
            code = aliyunConfig.login(telnum);
            return new ResultVO(0,"send login code",null);

        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }

    }

    @RequestMapping("/{telnum}/{msg}")
    public ResultVO login(@PathVariable("telnum") String telnum,@PathVariable("msg") String msg){
        Customer customer1 = new Customer();
        // 查看数据库是否存在
        Customer customer = customerService.queryById(telnum);
        String customerId = null;
        try {
            //不存在
            if(customer==null){
                customer1.setCustomerId(System.currentTimeMillis()+"");
                customer1.setCustomerPhone(telnum);
                customerService.insert(customer1);
                 customerId = customer1.getCustomerId();
            }
            //已存在
            else {
                 customerId = customer.getCustomerId();
            }
            if (msg!=null&&msg!=""){
                if (msg.equals(code)) { // 短信验证正确

                    /**
                     * setSubject 设置用户信息
                     * setId  设置用ID
                     * setIssuedAt  设置token的创建时间
                     * setExpiration    设置过期时间
                     * signWith 加密方式及key
                     */
                    String token = Jwts.builder()
                            .setSubject(telnum)
                            .setId(customerId)
                            .setIssuedAt(new Date())
                            .setExpiration(new Date(System.currentTimeMillis()+60*1000))
                            .signWith(SignatureAlgorithm.HS256,"motianlun")
                            .compact();
                    stringRedisTemplate.opsForValue().set(telnum+"@loginToken",token,36000, TimeUnit.SECONDS);
                    stringRedisTemplate.opsForValue().set(telnum,customerId,36000, TimeUnit.SECONDS);


                    CustomerVO customerVO = new CustomerVO(customerId, telnum, token);

                    return new ResultVO(0, "login success", customerVO);
                }
                else {
                    // 验证错误
                    return new ResultVO(1,"fail",null);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
        return new ResultVO(1,"fail",null);
    }

}