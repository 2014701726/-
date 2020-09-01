package whj.nb.nbmanager.bean;

public class Order {
    private String order_id;
    private String good_id;
    private String customer_id;
    private String create_time;
    private String address_id;
    private String remark;
    private String ticket_id;
    private String coupon_id;
    private String score_id;
    private String check_time_id;
    private String seat;
    private String taker_name;
    private String taker_phone;
    private String price;
    private Integer ticket_num;
    private String iszf;
    private String state;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getGood_id() {
        return good_id;
    }

    public void setGood_id(String good_id) {
        this.good_id = good_id;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getAddress_id() {
        return address_id;
    }

    public void setAddress_id(String address_id) {
        this.address_id = address_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(String coupon_id) {
        this.coupon_id = coupon_id;
    }

    public String getScore_id() {
        return score_id;
    }

    public void setScore_id(String score_id) {
        this.score_id = score_id;
    }

    public String getCheck_time_id() {
        return check_time_id;
    }

    public void setCheck_time_id(String check_time_id) {
        this.check_time_id = check_time_id;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTaker_name() {
        return taker_name;
    }

    public void setTaker_name(String taker_name) {
        this.taker_name = taker_name;
    }

    public String getTaker_phone() {
        return taker_phone;
    }

    public void setTaker_phone(String taker_phone) {
        this.taker_phone = taker_phone;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getTicket_num() {
        return ticket_num;
    }

    public void setTicket_num(Integer ticket_num) {
        this.ticket_num = ticket_num;
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
