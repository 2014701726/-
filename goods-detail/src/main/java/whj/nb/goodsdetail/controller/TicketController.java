package whj.nb.goodsdetail.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import whj.nb.goodsdetail.bean.Ticket;
import whj.nb.goodsdetail.dao.TicketDao;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("ticket")
public class TicketController {
    @Resource
    private TicketDao ticketDao;

    @RequestMapping("/detail/{id}")
    public ResultVO toFindTicketByid(@PathVariable("id")String id){
        Ticket ticket = ticketDao.findTicketByid(id);

        return new ResultVO(1,"success",ticket);
    }
}
