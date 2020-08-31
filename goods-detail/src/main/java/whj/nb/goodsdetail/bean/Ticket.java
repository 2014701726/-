package whj.nb.goodsdetail.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private String check_ticked_id;
    private String ticket_name;
    private String ticket_price;
    private String ticket_type;
    private String ticket_discount;
    private String seat_id;


}
