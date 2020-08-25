package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.motianluneureka.bean.Address;
import whj.nb.motianluneureka.service.AddressService;

import javax.annotation.Resource;

/**
 * (Address)表控制层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:04
 */
@RestController
@RequestMapping("address")
public class AddressController {
    /**
     * 服务对象
     */
    @Resource
    private AddressService addressService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Address selectOne(String id) {
        return this.addressService.queryById(id);
    }

}