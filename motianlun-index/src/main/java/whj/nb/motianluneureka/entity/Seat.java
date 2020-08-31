package whj.nb.motianluneureka.entity;

import java.io.Serializable;

/**
 * (Seat)实体类
 *
 * @author makejava
 * @since 2020-08-27 10:11:33
 */
public class Seat implements Serializable {
    private static final long serialVersionUID = 871604994623399137L;
    /**
     * 座位ID
     */
    private String seatId;
    /**
     * 座位分区ID
     */
    private String seatTypeId;
    /**
     * 演出类型ID
     */
    private String performanceTypeId;
    /**
     * 座位
     */
    private String seat;

    /**
     * 座位状态
     */
    private String seatState;

    public String getSeatState() {
        return seatState;
    }

    public void setSeatState(String seatState) {
        this.seatState = seatState;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getSeatTypeId() {
        return seatTypeId;
    }

    public void setSeatTypeId(String seatTypeId) {
        this.seatTypeId = seatTypeId;
    }

    public String getPerformanceTypeId() {
        return performanceTypeId;
    }

    public void setPerformanceTypeId(String performanceTypeId) {
        this.performanceTypeId = performanceTypeId;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

}