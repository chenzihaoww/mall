package com.jlu.mall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.jlu.mall.order.dao")
public class JluOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JluOrderApplication.class, args);
    }

}
