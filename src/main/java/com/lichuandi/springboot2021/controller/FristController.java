package com.lichuandi.springboot2021.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther digege
 * @Date 2021/4/21
 * @Description：com.lichuandi.springboot2021.controller version：1
 */
@RestController
//@Configuration
//@ConfigurationProperties(prefix = "my")
public class FristController {
    @GetMapping("/hi")
    public String Hi(){
        return "lichuandi";
    }
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;
    @RequestMapping(value = "/myname")
    public  String myName(){
        return "myname is "+name+"and"+age;
    }
}
