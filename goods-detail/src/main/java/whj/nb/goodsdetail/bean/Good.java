package whj.nb.goodsdetail.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Good {
    private String good_id;
    private String good_name;
    private String detail_url;
    private String good_img;
    private Integer look_up;
    private String show_time;
    private String show_address;
    private Integer good_love_num;
    private String detail_name;
    private String sku_id;
    private String good_detail;
    private Integer good_city_id;
    private String performance_type_id;

}
