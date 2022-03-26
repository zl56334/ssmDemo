package com.example.ssmdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan("com.example.ssmdemo.dao")
public class SsmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmDemoApplication.class, args);
    }

}
