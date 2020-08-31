package whj.nb.goodsdetail.service;

import whj.nb.goodsdetail.bean.Good;
import whj.nb.goodsdetail.bean.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> findByid(String id);
    Ticket findTicketByid(String id);
}
