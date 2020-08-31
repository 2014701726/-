<<<<<<< HEAD:motianlun-eureka/src/main/java/whj/nb/performance/MotianlunEurekaApplication.java
package whj.nb.performance;
=======
package whj.nb.goodsdetail;
>>>>>>> dev-long:motianlun-eureka/src/main/java/whj/nb/goodsdetail/MotianlunEurekaApplication.java

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
