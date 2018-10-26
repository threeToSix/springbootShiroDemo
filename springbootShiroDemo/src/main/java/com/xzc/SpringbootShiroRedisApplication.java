package com.xzc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xzc.API.mapper")
public class SpringbootShiroRedisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootShiroRedisApplication.class, args);
    }
}
