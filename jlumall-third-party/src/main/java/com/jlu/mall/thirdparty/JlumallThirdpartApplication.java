package com.jlu.mall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JlumallThirdpartApplication {
    public static void main(String[] args) {

        SpringApplication.run(JlumallThirdpartApplication.class, args);
    }
}