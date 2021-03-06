package whj.nb.goodsdetail.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckTime {
    private String id;
    private String check_time_id;
    private String check_time;
    private String check_ticket_id;
    private List<Ticket> ticketList;

}
