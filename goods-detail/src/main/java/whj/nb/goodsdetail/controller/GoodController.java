package whj.nb.goodsdetail.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.goodsdetail.bean.*;
import whj.nb.goodsdetail.service.CheckTimeService;
import whj.nb.goodsdetail.service.GoodService;
import whj.nb.goodsdetail.service.SkuService;
import whj.nb.goodsdetail.service.TicketService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("good")
@CrossOrigin
public class GoodController {
    @Resource
    private GoodService goodService;
    @Resource
    private SkuService skuService;
    @Resource
    private CheckTimeService checkTimeService;
    @Resource
    private TicketService ticketService;

    @RequestMapping("/detail/{id}")
    public ResultVO FindGoodByid(@PathVariable("id") String id){
        BeanSet beanSet = new BeanSet();
        Good good = goodService.findByid(id);
        List<Sku> skuList = skuService.findByid(id);
        List<CheckTime> checkTimeList = checkTimeService.findByid(id);
        List<Ticket> ticketList = ticketService.findByid(id);
        beanSet.setGood(good);
        beanSet.setSkuList(skuList);
        beanSet.setCheckTimeList(checkTimeList);
        beanSet.setTicketList(ticketList);
        return new ResultVO<BeanSet>(1,"success",beanSet);

    }

        @RequestMapping("/regoodlist/{id}")
        public ResultVO toGoodSet(@PathVariable("id") String id){

            List<Good> goods = goodService.reGoodList(id);
            System.out.println(goods);
            return new ResultVO<List<Good>>(1,"success",goods);
        }

        @RequestMapping("allGoods")
        public ResultVO toFindAllGoods(){
            List<Good> allGoods = goodService.findAllGoods();
            System.out.println(allGoods);
            return new ResultVO<List<Good>>(1,"success",allGoods);
        }


}
