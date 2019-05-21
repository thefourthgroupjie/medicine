package com.xb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients  //注解开启Feign的功能
public class CluodFeignLllApplication {

    public static void main(String[] args) {
        SpringApplication.run(CluodFeignLllApplication.class, args);
    }

}
