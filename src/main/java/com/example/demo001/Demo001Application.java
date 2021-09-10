package com.example.demo001;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 15791
 */
@SpringBootApplication
@Mapper
public class Demo001Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo001Application.class, args);
    }

}
