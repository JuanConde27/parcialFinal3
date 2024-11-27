package co.com.conde.coursesmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {
        "co.com.conde.entitycommon",
        "co.com.conde.coursesmicroservice",
})
@EntityScan(basePackages = {
        "co.com.conde.entitycommon.models.entity",
        "co.com.conde.coursesmicroservice.models.entity"
})

public class CoursesmicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursesmicroserviceApplication.class, args);
    }

}
