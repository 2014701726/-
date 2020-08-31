package whj.nb.performance.entity;

import java.io.Serializable;

/**
 * (Ticket)实体类
 *
 * @author makejava
 * @since 2020-08-26 16:47:23
 */
public class Ticket implements Serializable {
    private static final long serialVersionUID = 941320454947670522L;
    /**
    * 票面ID
    */
    private String checkTickedId;
    /**
    * 票面
    */
    private String ticketName;
    /**
    * 价格
    */
    private Double ticketPrice;
    /**
    * 票面类型
    */
    private String ticketType;
    /**
    * 折扣
    */
    private String ticketDiscount;


    public String getCheckTickedId() {
        return checkTickedId;
    }

    public void setCheckTickedId(String checkTickedId) {
        this.checkTickedId = checkTickedId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTicketDiscount() {
        return ticketDiscount;
    }

    public void setTicketDiscount(String ticketDiscount) {
        this.ticketDiscount = ticketDiscount;
    }

}