package com.xb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient  //代表是eureka的客户端注册到注册中心
@MapperScan("com.xb.mapper")
public class CloudProviderRhjApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderRhjApplication.class, args);
    }

}
