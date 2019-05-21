package com.xb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.xb"})
@EnableEurekaClient
@MapperScan("com.xb.mapper")

public class DloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DloudProviderApplication.class, args);
    }

}
