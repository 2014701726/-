package whj.nb.goodsdetail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "whj.nb.goodsdetail.dao")
public class GoodDetailApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodDetailApplication.class, args);
    }

}
