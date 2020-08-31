package whj.nb.performance.entity;

import java.io.Serializable;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2020-08-25 12:03:07
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 808859712931460732L;

    //时间
    private String time;
    //条件-热门-最近-折扣
    private String condition;

    //票面
    private  Ticket ticket;


    /**
    * 商品ID
    */
    private Integer goodId;
    /**
    * 商品名称
    */
    private String goodName;
    /**
    * 详情页链接
    */
    private String detailUrl;
    /**
    * 图片
    */
    private String goodImg;
    /**
    * 浏览人数
    */
    private Integer lookUp;
    /**
    * 演出时间段
    */
    private Object showTime;
    /**
    * 演出地址
    */
    private String showAddress;
    /**
    * 想看人数
    */
    private Integer goodLoveNum;
    /**
    * 详情标题
    */
    private String detailName;
    /**
    * 套餐ID
    */
    private String skuId;
    /**
    * 商品介绍
    */
    private Object goodDetail;
    /**
    * 城市ID
    */
    private String goodCityId;
    /**
    * 演出类型ID（1-9：演唱会-体育）
    */
    private String performanceTypeId;

    private Integer ticketStatus;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                ", goodImg='" + goodImg + '\'' +
                ", lookUp=" + lookUp +
                ", showTime=" + showTime +
                ", showAddress='" + showAddress + '\'' +
                ", goodLoveNum=" + goodLoveNum +
                ", detailName='" + detailName + '\'' +
                ", skuId='" + skuId + '\'' +
                ", goodDetail=" + goodDetail +
                ", goodCityId='" + goodCityId + '\'' +
                ", performanceTypeId='" + performanceTypeId + '\'' +
                ", ticketStatus=" + ticketStatus +
                '}';
    }

    public Goods() {
    }

    public Goods(Integer goodId, String goodName, String detailUrl, String goodImg, Integer lookUp, Object showTime, String showAddress, Integer goodLoveNum, String detailName, String skuId, Object goodDetail, String goodCityId, String performanceTypeId, Integer ticketStatus) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.detailUrl = detailUrl;
        this.goodImg = goodImg;
        this.lookUp = lookUp;
        this.showTime = showTime;
        this.showAddress = showAddress;
        this.goodLoveNum = goodLoveNum;
        this.detailName = detailName;
        this.skuId = skuId;
        this.goodDetail = goodDetail;
        this.goodCityId = goodCityId;
        this.performanceTypeId = performanceTypeId;
        this.ticketStatus = ticketStatus;
    }

    public Integer getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg;
    }

    public Integer getLookUp() {
        return lookUp;
    }

    public void setLookUp(Integer lookUp) {
        this.lookUp = lookUp;
    }

    public Object getShowTime() {
        return showTime;
    }

    public void setShowTime(Object showTime) {
        this.showTime = showTime;
    }

    public String getShowAddress() {
        return showAddress;
    }

    public void setShowAddress(String showAddress) {
        this.showAddress = showAddress;
    }

    public Integer getGoodLoveNum() {
        return goodLoveNum;
    }

    public void setGoodLoveNum(Integer goodLoveNum) {
        this.goodLoveNum = goodLoveNum;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Object getGoodDetail() {
        return goodDetail;
    }

    public void setGoodDetail(Object goodDetail) {
        this.goodDetail = goodDetail;
    }

    public String getGoodCityId() {
        return goodCityId;
    }

    public void setGoodCityId(String goodCityId) {
        this.goodCityId = goodCityId;
    }

    public String getPerformanceTypeId() {
        return performanceTypeId;
    }

    public void setPerformanceTypeId(String performanceTypeId) {
        this.performanceTypeId = performanceTypeId;
    }

}