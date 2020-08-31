package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.*;
import whj.nb.motianluneureka.entity.Address;
import whj.nb.motianluneureka.entity.City;
import whj.nb.motianluneureka.service.CityService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

/**
 * (City)表控制层
 *
 * @author makejava
 * @since 2020-08-27 09:01:22
 */
@RestController
@CrossOrigin
@RequestMapping("city")
public class CityController {
    /**
     * 服务对象
     */
    @Resource
    private CityService cityService;

    @RequestMapping(value = "/{cityId}",method = RequestMethod.GET)
    public ResultVO queryOne(@PathVariable("cityId") Integer cityId) {
        try {
            List<City> cityList = cityService.queryById(cityId);
            return new ResultVO(0,"find six city success",cityList);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResultVO queryAll() {
        try {
            List<City> cityList = cityService.queryAll();
            return new ResultVO(0,"find cityList success",cityList);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }
    }

}