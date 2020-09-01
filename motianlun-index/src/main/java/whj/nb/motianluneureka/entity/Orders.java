package whj.nb.motianluneureka.entity;

import java.io.Serializable;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2020-08-28 19:15:39
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = -36177630475121860L;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 商品ID
     */
    private String goodId;
    /**
     * 用户ID
     */
    private String customerId;
    /**
     * 下单时间
     */
    private String createTime;
    /**
     * 地址ID
     */
    private String addressId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 票面ID
     */
    private String ticketId;
    /**
     * 优惠券ID
     */
    private String couponId;
    /**
     * 魔力值ID
     */
    private String scoreId;
    /**
     * 场次ID
     */
    private String checkTimeId;
    /**
     * 座位
     */
    private String seat;
    /**
     * 取票人姓名
     */
    private String takerName;
    /**
     * 取票人手机号
     */
    private String takerPhone;
    /**
     * 价格
     */
    private Object price;
    /**
     * 数量
     */
    private Integer ticketNum;
    /**
     * 支付状态（0：为支付，1：已支付）
     */
    private String iszf;
    /**
     * 0：已下单，1：已失效
     */
    private String state;


    private Goods goods;
    private CheckTime checkTime;
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public CheckTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(CheckTime checkTime) {
        this.checkTime = checkTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId;
    }

    public String getCheckTimeId() {
        return checkTimeId;
    }

    public void setCheckTimeId(String checkTimeId) {
        this.checkTimeId = checkTimeId;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTakerName() {
        return takerName;
    }

    public void setTakerName(String takerName) {
        this.takerName = takerName;
    }

    public String getTakerPhone() {
        return takerPhone;
    }

    public void setTakerPhone(String takerPhone) {
        this.takerPhone = takerPhone;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public Integer getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getIszf() {
        return iszf;
    }

    public void setIszf(String iszf) {
        this.iszf = iszf;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}