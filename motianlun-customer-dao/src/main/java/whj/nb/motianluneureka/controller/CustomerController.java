package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.motianluneureka.bean.Customer;
import whj.nb.motianluneureka.service.CustomerService;

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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Customer selectOne(String id) {
        return this.customerService.queryById(id);
    }

}