package whj.nb.performance.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.inject.internal.cglib.core.$LocalVariablesSorter;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateUtils;
import org.apache.http.HttpHost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import whj.nb.performance.entity.Goods;
import whj.nb.performance.service.GoodsService;
import org.springframework.web.bind.annotation.*;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.*;

/**
 * 九大类型票数据
 *
 * (Goods)表控制层
 *
 * @author makejava
 * @since 2020-08-25 12:03:07
 */
@CrossOrigin
@RestController
@RequestMapping("goods")
public class GoodsController {
    /**
     * 查所有
     */
    @Resource
    private GoodsService goodsService;




    @GetMapping("selectPerformance/{cityId}/{performanceTypeId}/{time}/{condition}/{pageNum}")
    public ResultVO selectPerformance(@PathVariable("cityId") Integer cityId,@PathVariable("performanceTypeId") String performanceTypeId,
                                      @PathVariable("time") String time,@PathVariable("condition") String condition,
                                      @PathVariable("pageNum" ) Integer pageNum) {
        ResultVO<Object> ResultVO = new ResultVO<>();

        if (pageNum == null || pageNum<=0){
            pageNum = 1;
        }

        PageHelper.startPage(pageNum,10);
        try{

            List<Goods> goods = goodsService.queryById(cityId, performanceTypeId,time,condition);

            PageInfo<Goods> goodsPageInfo = new PageInfo<>(goods);

            ResultVO.setCode(0);
            ResultVO.setMsg("success");
            ResultVO.setT(goodsPageInfo);

        }catch (Exception e){
            e.printStackTrace();
            ResultVO.setCode(1);
            ResultVO.setMsg("fail");
            return ResultVO;
        }

        return ResultVO;
    }



}