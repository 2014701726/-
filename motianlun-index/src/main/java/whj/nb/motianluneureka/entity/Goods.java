package whj.nb.motianluneureka.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2020-08-25 10:21:35
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 876761067442397314L;
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
    private Date showTime;
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
    private Integer goodCityId;
    /**
     * 演出类型ID（1-9：演唱会-体育）
     */
    private String performanceTypeId;

    /**
     * 场次
     */
    private String checkTime;

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * 票价
     */
    private Double ticketPrice;

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * 折扣
     */
    private String ticketDiscount;

    public String getTicketDiscount() {
        return ticketDiscount;
    }

    public void setTicketDiscount(String ticketDiscount) {
        this.ticketDiscount = ticketDiscount;
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

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
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

    public Integer getGoodCityId() {
        return goodCityId;
    }

    public void setGoodCityId(Integer goodCityId) {
        this.goodCityId = goodCityId;
    }

    public String getPerformanceTypeId() {
        return performanceTypeId;
    }

    public void setPerformanceTypeId(String performanceTypeId) {
        this.performanceTypeId = performanceTypeId;
    }
}