package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.motianluneureka.bean.CustomerLove;
import whj.nb.motianluneureka.service.CustomerLoveService;

import javax.annotation.Resource;

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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CustomerLove selectOne(String id) {
        return this.customerLoveService.queryById(id);
    }

}