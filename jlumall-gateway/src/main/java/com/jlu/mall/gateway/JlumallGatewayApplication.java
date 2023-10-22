package com.jlu.mall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.sql.DataSource;
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JlumallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(JlumallGatewayApplication.class, args);
    }

}
