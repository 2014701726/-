package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.*;
import whj.nb.motianluneureka.entity.Goods;
import whj.nb.motianluneureka.service.GoodsService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2020-08-25 10:21:36
 */
@RestController
@CrossOrigin
@RequestMapping("goods")
public class GoodsController {
    /**
     * 服务对象
     */
    @Resource
    private GoodsService goodsService;

    @RequestMapping("hot/{goodCityId}/{performanceTypeId}")
    public ResultVO findAllByType(@PathVariable("goodCityId") Integer goodCityId, @PathVariable("performanceTypeId") String performanceTypeId) {
        ResultVO<Object> resultVO = new ResultVO<>();
        try {
            List<Goods> allByType = goodsService.findAllByType(goodCityId, performanceTypeId).getAllByType();
            resultVO.setT(allByType);
            resultVO.setCode(0);
        } catch (Exception e) {
            e.printStackTrace();
            resultVO.setCode(1);
        }

        return resultVO;
    }

    @RequestMapping("hot/{goodCityId}")
    public ResultVO findAllByHot(@PathVariable("goodCityId") Integer goodCityId) {
        ResultVO<Object> resultVO = new ResultVO<>();
        try {
            List<Goods> allByHot = goodsService.findAllByHot(goodCityId);
            resultVO.setT(allByHot);
            resultVO.setCode(0);
        } catch (Exception e) {
            e.printStackTrace();
            resultVO.setCode(1);
        }

        return resultVO;
    }


    @RequestMapping("love/{goodCityId}")
    public ResultVO findAllByLove(@PathVariable("goodCityId") Integer goodCityId) {
        ResultVO<Object> resultVO = new ResultVO<>();
        try {
            List<Goods> allByLove = goodsService.findAllByLove(goodCityId).getAllByLove();
            resultVO.setT(allByLove);
            resultVO.setCode(0);
        } catch (Exception e) {
            e.printStackTrace();
            resultVO.setCode(1);
        }

        return resultVO;
    }

    @RequestMapping("discount/{goodCityId}")
    public ResultVO findAllByDiscount(@PathVariable("goodCityId") Integer goodCityId) {
        ResultVO<Object> resultVO = new ResultVO<>();
        try {
            List<Goods> allByDiscount = goodsService.findAllByDiscount(goodCityId).getAllByDiscount();
            resultVO.setT(allByDiscount);
            resultVO.setCode(0);
        } catch (Exception e) {
            e.printStackTrace();
            resultVO.setCode(1);
        }

        return resultVO;
    }

    @RequestMapping("date/{goodCityId}/{showTime}/{limit}")
    public ResultVO findAllByTime(@PathVariable("goodCityId") Integer goodCityId, @PathVariable("showTime") String showTime, @PathVariable("limit") Integer limit) {
        ResultVO<Object> resultVO = new ResultVO<>();
        try {
            List<Goods> allByTime = goodsService.findAllByTime(goodCityId, showTime, limit).getAllByTime();
            resultVO.setT(allByTime);
            resultVO.setCode(0);
        } catch (Exception e) {
            e.printStackTrace();
            resultVO.setCode(1);
        }

        return resultVO;
    }

}