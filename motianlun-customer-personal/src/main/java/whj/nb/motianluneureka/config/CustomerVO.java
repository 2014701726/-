package whj.nb.motianluneureka.config;

/**
 * @Author ChanzZ
 * @DATE 2020/08/29
 **/
public class CustomerVO {
    private String  customerId;
    private String customerPhone;
    private String token;

    public CustomerVO() {
    }

    public CustomerVO(String customerId, String customerPhone, String token) {
        this.customerId = customerId;
        this.customerPhone = customerPhone;
        this.token = token;
    }

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
