package whj.nb.motianluneureka.entity;

import java.io.Serializable;

/**
 * (CheckTime)实体类
 *
 * @author makejava
 * @since 2020-09-01 10:04:56
 */
public class CheckTime implements Serializable {
    private static final long serialVersionUID = -53855559184027060L;

    private Integer id;
    /**
     * 场次ID
     */
    private String checkTimeId;
    /**
     * 场次详情
     */
    private String checkTime;
    /**
     * 场次的票面ID
     */
    private String checkTicketId;
    /**
     * 0:可选座，1：不可选
     */
    private String isSeat;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheckTimeId() {
        return checkTimeId;
    }

    public void setCheckTimeId(String checkTimeId) {
        this.checkTimeId = checkTimeId;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckTicketId() {
        return checkTicketId;
    }

    public void setCheckTicketId(String checkTicketId) {
        this.checkTicketId = checkTicketId;
    }

    public String getIsSeat() {
        return isSeat;
    }

    public void setIsSeat(String isSeat) {
        this.isSeat = isSeat;
    }
}