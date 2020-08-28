package whj.nb.motianluneureka.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.motianluneureka.entity.Seat;
import whj.nb.motianluneureka.entity.SeatType;
import whj.nb.motianluneureka.service.SeatService;
import whj.nb.motianluneureka.service.SeatTypeService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (Seat)表控制层
 *
 * @author makejava
 * @since 2020-08-27 10:11:34
 */
@CrossOrigin
@RestController
@RequestMapping("seat")
public class SeatController {
    /**
     * 服务对象
     */
    @Resource
    private SeatService seatService;
    @Resource
    private SeatTypeService seatTypeService;

    @RequestMapping("check")
    public ResultVO check(){
        ResultVO<Object> resultVO = new ResultVO<>();
        ArrayList<ResultVO> resultVOS = new ArrayList<>();

        try {
            List<SeatType> seatTypeList = seatTypeService.queryAll();
            List<String> strings = seatService.queryAllByState();
            resultVOS.add(new ResultVO(0,"座位类型集合",seatTypeList));
            resultVOS.add(new ResultVO(0,"已售座位集合",strings));
            resultVO.setCode(0);
            resultVO.setT(resultVOS);
        }catch (Exception e){
            e.printStackTrace();
            resultVO.setCode(1);
        }
        return resultVO;
    }

}