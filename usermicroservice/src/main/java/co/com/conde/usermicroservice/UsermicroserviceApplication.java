package co.com.conde.usermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {
        "co.com.conde.entitycommon",
        "co.com.conde.usermicroservice",
})
@EntityScan(basePackages = {
        "co.com.conde.entitycommon.models.entity"
})
public class UsermicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsermicroserviceApplication.class, args);
    }

}
