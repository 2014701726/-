package whj.nb.goodsdetail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(basePackages = "whj.nb.goodsdetail.dao")
@EnableEurekaClient
public class GoodDetailApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodDetailApplication.class, args);
    }

}
