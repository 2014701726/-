package whj.nb.motianluneureka.bean;

/**
 * @Author ChanzZ
 * @DATE 2020/08/25
 **/
public class Customer {
    /**
     * 用户ID
     */
    private String customerId;
    /**
     * 手机号
     */
    private String customerPhone;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 优惠券ID
     */
    private String couponId;
    /**
     * 收藏商品ID
     */
    private String goodId;
    /**
     * 地址ID
     */
    private String addressId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
}
