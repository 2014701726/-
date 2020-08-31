package whj.nb.motianluneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MotianlunCustomerPersonalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MotianlunCustomerPersonalApplication.class, args);
    }
}
