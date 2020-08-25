package whj.nb.motianluneureka.bean;

import java.io.Serializable;

/**
 * (CustomerLove)实体类
 *
 * @author ChanzZ
 * @since 2020-08-25 14:06:47
 */
public class CustomerLove implements Serializable {
    private static final long serialVersionUID = 356350056769194263L;
    /**
     * 主键
     */
    private String customerLoveId;
    /**
     * 用户ID
     */
    private String customerId;
    /**
     * 商品ID
     */
    private String goodId;


    public String getCustomerLoveId() {
        return customerLoveId;
    }

    public void setCustomerLoveId(String customerLoveId) {
        this.customerLoveId = customerLoveId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

}