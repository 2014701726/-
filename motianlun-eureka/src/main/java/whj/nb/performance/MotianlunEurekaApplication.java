package whj.nb.performance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MotianlunEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MotianlunEurekaApplication.class, args);

    }
}
