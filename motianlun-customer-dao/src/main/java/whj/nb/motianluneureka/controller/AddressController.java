package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.*;
import whj.nb.motianluneureka.entity.Address;
import whj.nb.motianluneureka.service.AddressService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Address)表控制层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:04
 */
@RestController
@CrossOrigin
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
     * @param customerId 主键
     * @return 单条数据
     */
    @RequestMapping(value = "list/{customerId}",method = RequestMethod.GET)
    public ResultVO queryAll(@PathVariable("customerId") String customerId) {
        try {
            List<Address> addressList = addressService.queryAll(customerId);
            return new ResultVO(0,"find addressList success",addressList);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ResultVO save(@RequestBody Address address){
        try {
            addressService.insert(address);
            return new ResultVO(0,"add address success",null);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResultVO update(@RequestBody Address address){
        try {
            addressService.update(address);
            return new ResultVO(0,"update address success",null);

        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

    @RequestMapping(value = "/{address_id}",method = RequestMethod.DELETE)
    public ResultVO delete(@PathVariable("address_id")String address_id){
        try {
            boolean b = addressService.deleteById(address_id);
            if(b){
                return new ResultVO(0,"del address success",null);
            }else {
                return new ResultVO(1,"fail",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

}