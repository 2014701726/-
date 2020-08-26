package whj.nb.goodsdetail.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sku {
    private String sku_id;
    private String check_time_id;
    private CheckTime checkTime;
}
