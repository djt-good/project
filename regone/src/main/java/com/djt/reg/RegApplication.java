package com.djt.reg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.djt.reg.mapper")
@ServletComponentScan("com.djt.reg.config")
public class RegApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegApplication.class, args);
    }

}
