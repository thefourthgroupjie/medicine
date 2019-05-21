package com.xb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient  //代表是eureka的客户端注册到注册中心
@MapperScan("com.xb.mapper")
public class DrugProviderZhApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrugProviderZhApplication.class, args);
    }

}
