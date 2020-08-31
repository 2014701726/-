package whj.nb.goodsdetail.service.Impl;

import org.springframework.stereotype.Service;
import whj.nb.goodsdetail.bean.Good;
import whj.nb.goodsdetail.bean.Ticket;
import whj.nb.goodsdetail.dao.GoodDao;
import whj.nb.goodsdetail.dao.TicketDao;
import whj.nb.goodsdetail.service.GoodService;
import whj.nb.goodsdetail.service.TicketService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TicketserviceImpl implements TicketService {

    @Resource
    private TicketDao ticketDao;


    @Override
    public List<Ticket> findByid(String id) {
        return ticketDao.findByid(id);
    }

    @Override
    public Ticket findTicketByid(String id) {
        return ticketDao.findTicketByid(id);
    }
}
