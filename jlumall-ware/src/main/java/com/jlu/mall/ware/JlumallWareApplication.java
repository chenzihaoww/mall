package com.jlu.mall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jlu.mall.ware.dao")
public class JlumallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(JlumallWareApplication.class, args);
    }

}
