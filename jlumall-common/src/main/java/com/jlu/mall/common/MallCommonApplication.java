package com.jlu.mall.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.jlu.mall.product.dao")
public class MallCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCommonApplication.class, args);
    }

}
