package whj.nb.motianluneureka.entity;


public class Orders {

  private String orderId;
  private String goodId;
  private String customerId;
  private String createTime;
  private String addressId;
  private String remark;
  private String ticketId;
  private String couponId;
  private String scoreId;
  private String checkTimeId;
  private String seatId;
  private String takerName;
  private String takerPhone;
  private Goods goods;
  private Ticket ticket;

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

  public String getSeatId() {
    return seatId;
  }

  public void setSeatId(String seatId) {
    this.seatId = seatId;
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

  public Goods getGoods() {
    return goods;
  }

  public void setGoods(Goods goods) {
    this.goods = goods;
  }

  public Ticket getTicket() {
    return ticket;
  }

  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }
}
