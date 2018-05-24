package com.sml.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan(basePackages = "com.sml.mybatis.pojo")
public class MybatisApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MybatisApplication.class, args);
    }
}
