package whj.nb.nbmanager.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String customer_id;
    private String customer_phone;
    private Integer isvip;

}
