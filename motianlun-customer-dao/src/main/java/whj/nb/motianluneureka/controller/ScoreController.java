package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.*;
import whj.nb.motianluneureka.bean.Coupon;
import whj.nb.motianluneureka.bean.Score;
import whj.nb.motianluneureka.service.ScoreService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Score)表控制层
 *
 * @author ChanzZ
 * @since 2020-08-25 11:08:23
 */
@RestController
@RequestMapping("score")
public class ScoreController {
    /**
     * 服务对象
     */
    @Resource
    private ScoreService scoreService;

    /**
     * 摩力值使用情况及现有的摩力值（list中最后一个的num）
     * @param customerId
     * @return
     */
    @RequestMapping(value = "/{customerId}",method = RequestMethod.GET)
    public ResultVO findNum(@PathVariable("customerId")String customerId){
        try {
            List<Score> scoreList = scoreService.queryAll(customerId);
            return new ResultVO(0,"find scoreList success",scoreList);
        }catch (Exception e){
            e.printStackTrace();
            return new ResultVO(1,"fail",null);
        }

    }

}