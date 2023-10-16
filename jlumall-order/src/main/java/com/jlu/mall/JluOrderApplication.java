package com.jlu.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jlu.mall.order.dao")
public class JluOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JluOrderApplication.class, args);
    }

}
