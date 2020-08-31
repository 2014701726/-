package whj.nb.nbmanager.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Good {
    private Integer good_id;
    private String good_name;
    private int good_price;
    private String detail_url;
    private String good_img;
    private Integer look_up;

    public Integer getGood_id() {
        return good_id;
    }

    public Good() {
    }

    public Good(Integer good_id, String good_name, int good_price, String detail_url, String good_img, Integer look_up, String show_time, String show_address, Integer good_love_num, String detail_name, String sku_id, String good_detail, Integer good_city_id, String performance_type_id, Integer ticket_status) {
        this.good_id = good_id;
        this.good_name = good_name;
        this.good_price = good_price;
        this.detail_url = detail_url;
        this.good_img = good_img;
        this.look_up = look_up;
        this.show_time = show_time;
        this.show_address = show_address;
        this.good_love_num = good_love_num;
        this.detail_name = detail_name;
        this.sku_id = sku_id;
        this.good_detail = good_detail;
        this.good_city_id = good_city_id;
        this.performance_type_id = performance_type_id;
        this.ticket_status = ticket_status;
    }

    public void setGood_id(Integer good_id) {

        this.good_id = good_id;
    }

    public String getGood_name() {
        return good_name;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public int getGood_price() {
        return good_price;
    }

    public void setGood_price(int good_price) {
        this.good_price = good_price;
    }

    public String getDetail_url() {
        return detail_url;
    }

    public void setDetail_url(String detail_url) {
        this.detail_url = detail_url;
    }

    public String getGood_img() {
        return good_img;
    }

    public void setGood_img(String good_img) {
        this.good_img = good_img;
    }

    public Integer getLook_up() {
        return look_up;
    }

    public void setLook_up(Integer look_up) {
        this.look_up = look_up;
    }

    public String getShow_time() {
        return show_time;
    }

    public void setShow_time(String show_time) {
        this.show_time = show_time;
    }

    public String getShow_address() {
        return show_address;
    }

    public void setShow_address(String show_address) {
        this.show_address = show_address;
    }

    public Integer getGood_love_num() {
        return good_love_num;
    }

    public void setGood_love_num(Integer good_love_num) {
        this.good_love_num = good_love_num;
    }

    public String getDetail_name() {
        return detail_name;
    }

    public void setDetail_name(String detail_name) {
        this.detail_name = detail_name;
    }

    public String getSku_id() {
        return sku_id;
    }

    public void setSku_id(String sku_id) {
        this.sku_id = sku_id;
    }

    public String getGood_detail() {
        return good_detail;
    }

    public void setGood_detail(String good_detail) {
        this.good_detail = good_detail;
    }

    public Integer getGood_city_id() {
        return good_city_id;
    }

    public void setGood_city_id(Integer good_city_id) {
        this.good_city_id = good_city_id;
    }

    public String getPerformance_type_id() {
        return performance_type_id;
    }

    public void setPerformance_type_id(String performance_type_id) {
        this.performance_type_id = performance_type_id;
    }

    public Integer getTicket_status() {
        return ticket_status;
    }

    public void setTicket_status(Integer ticket_status) {
        this.ticket_status = ticket_status;
    }

    private String show_time;
    private String show_address;
    private Integer good_love_num;
    private String detail_name;
    private String sku_id;
    private String good_detail;
    private Integer good_city_id;
    private String performance_type_id;
    private Integer ticket_status;


}
