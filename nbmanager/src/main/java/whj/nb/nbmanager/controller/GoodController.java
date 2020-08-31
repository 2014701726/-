package whj.nb.nbmanager.controller;

import org.springframework.web.bind.annotation.*;

import whj.nb.nbmanager.bean.Good;
import whj.nb.nbmanager.service.GoodService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("manager")
public class GoodController {
    @Resource
    private GoodService goodService;

    @RequestMapping("addGood")
    public ResultVO FindGoodByid(@RequestBody Good good){
        System.out.println(1);
//        Good good1 = new Good(2003,"dage四日游",150,"","https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1125984438,280959550&fm=26&gp=0.jpg",
//        1345,"2020-09-06","杭州大明湖畔",3,"闲敲棋子落灯花，一束梨花压海棠","1",
//                "君生我生时不待，停车枫林晚坐爱。" +
//                        "寻花问柳在何处，灯火阑珊不归路。" +
//                "春水东流英雄冢，行车坐卧美人乡"+
//                        "夜走清幽入直径，直捣黄龙破落红"+
//                        "男人本色当擎天，直让九天落凡尘"+
//                        "一席鲜衣上烈马，酌酒入喉当作歌"
//                ,7,"1",1);
        Integer integer = goodService.addGood(good);
        System.out.println(integer);
        return new ResultVO(1,"success",integer);
    }




}
