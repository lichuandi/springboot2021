package com.lichuandi.springboot2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class Springboot2021Application {


    public static void main(String[] args) {
        SpringApplication.run(Springboot2021Application.class, args);
    }

}
