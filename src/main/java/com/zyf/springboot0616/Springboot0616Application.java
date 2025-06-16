package com.zyf.springboot0616;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyf.springboot0616.mapper")
public class Springboot0616Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot0616Application.class, args);
    }

}
