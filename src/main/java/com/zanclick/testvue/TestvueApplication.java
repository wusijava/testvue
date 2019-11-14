package com.zanclick.testvue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan(value = "{com.zanclick.testvue}")
public class TestvueApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestvueApplication.class, args);
    }

}
