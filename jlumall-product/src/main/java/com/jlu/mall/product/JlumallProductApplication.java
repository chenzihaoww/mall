package com.jlu.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.jlu.mall.product.dao")
public class JlumallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(JlumallProductApplication.class, args);
    }

}
