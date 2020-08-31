package whj.nb.motianluneureka.entity;

import java.io.Serializable;
import java.util.List;

/**
 * (SeatType)实体类
 *
 * @author makejava
 * @since 2020-08-27 10:22:28
 */
public class SeatType implements Serializable {
    private static final long serialVersionUID = -77664502720656638L;
    /**
     * 座位分区ID
     */
    private String seatTypeId;
    /**
     * 座位分区类型
     */
    private String seatType;
    /**
     * 座位分区的座位数
     */
    private String seatTypeNum;
    /**
     * 座位的价格折扣率
     */
    private Object seatDiscount;

    private List<String> seatList;

    public List<String> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<String> seatList) {
        this.seatList = seatList;
    }

    public String getSeatTypeId() {
        return seatTypeId;
    }

    public void setSeatTypeId(String seatTypeId) {
        this.seatTypeId = seatTypeId;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSeatTypeNum() {
        return seatTypeNum;
    }

    public void setSeatTypeNum(String seatTypeNum) {
        this.seatTypeNum = seatTypeNum;
    }

    public Object getSeatDiscount() {
        return seatDiscount;
    }

    public void setSeatDiscount(Object seatDiscount) {
        this.seatDiscount = seatDiscount;
    }

}