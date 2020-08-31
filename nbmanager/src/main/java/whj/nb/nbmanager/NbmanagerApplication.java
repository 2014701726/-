package whj.nb.nbmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "whj.nb.nbmanager.dao")
public class NbmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbmanagerApplication.class, args);
    }

}
