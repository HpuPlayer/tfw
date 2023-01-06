package com.example.tfw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.tfw.mapper")
public class TfwApplication {

    public static void main(String[] args) {
        SpringApplication.run(TfwApplication.class, args);
    }

}
