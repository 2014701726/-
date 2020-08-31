package whj.nb.goodsdetail.dao;


import whj.nb.goodsdetail.bean.Ticket;

import java.util.List;

public interface TicketDao {
    List<Ticket> findByid(String id);
    Ticket findTicketByid(String id);
}
