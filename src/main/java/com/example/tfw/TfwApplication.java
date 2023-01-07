package com.example.tfw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@MapperScan("com.example.tfw.mapper")
@EnableOpenApi
public class TfwApplication {

    public static void main(String[] args) {
        SpringApplication.run(TfwApplication.class, args);
    }

}
