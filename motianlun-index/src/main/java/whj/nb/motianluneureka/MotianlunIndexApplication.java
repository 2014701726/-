package whj.nb.motianluneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MotianlunIndexApplication {

    public static void main(String[] args) {
        SpringApplication.run(MotianlunIndexApplication.class, args);
    }

}
