package com.xb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xb.mapper")

public class CluodProviderWlzApplication {

    public static void main(String[] args) {
        SpringApplication.run(CluodProviderWlzApplication.class, args);
    }

}
