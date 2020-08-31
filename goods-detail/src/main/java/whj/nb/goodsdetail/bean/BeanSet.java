package whj.nb.goodsdetail.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class BeanSet {
    private Good good;
    private List<Sku> skuList;
    private List<CheckTime> checkTimeList;
    private List<Ticket> ticketList;

    public BeanSet() {
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public List<Sku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList) {
        this.skuList = skuList;
    }

    public List<CheckTime> getCheckTimeList() {
        return checkTimeList;
    }

    public void setCheckTimeList(List<CheckTime> checkTimeList) {
        this.checkTimeList = checkTimeList;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }
}
