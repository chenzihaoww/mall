package com.jlu.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jlu.mall.coupon.dao")
public class JluCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(JluCouponApplication.class, args);
    }

}
