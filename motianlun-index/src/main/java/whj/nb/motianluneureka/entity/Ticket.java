package whj.nb.motianluneureka.entity;

import java.io.Serializable;

/**
 * (Ticket)实体类
 *
 * @author makejava
 * @since 2020-09-01 10:37:01
 */
public class Ticket implements Serializable {
    private static final long serialVersionUID = 113635697565092275L;
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
    private Object ticketPrice;
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

    public Object getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Object ticketPrice) {
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