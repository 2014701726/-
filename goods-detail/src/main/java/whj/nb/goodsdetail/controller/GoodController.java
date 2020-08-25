package whj.nb.goodsdetail.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.goodsdetail.bean.Good;
import whj.nb.goodsdetail.service.GoodService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;

@RestController
@RequestMapping("good")
@CrossOrigin
public class GoodController {
    @Resource
    private GoodService goodService;

    @RequestMapping("/detail/{id}")
    public ResultVO<Good> FindGoodByid(@PathVariable("id") String id){
        System.out.println(1);
        Good good = goodService.findByid(id);
        System.out.println(good);
        return new ResultVO<Good>(1,"success",good);

    }
}
