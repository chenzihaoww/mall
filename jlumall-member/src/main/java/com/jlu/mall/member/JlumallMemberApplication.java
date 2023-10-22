package com.jlu.mall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.jlu.mall.member.feign")
@MapperScan("com.jlu.mall.member.dao")
public class JlumallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(JlumallMemberApplication.class, args);
    }

}
