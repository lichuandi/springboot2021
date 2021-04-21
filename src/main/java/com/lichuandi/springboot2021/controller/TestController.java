package com.lichuandi.springboot2021.controller;

import com.lichuandi.springboot2021.configBean.ConfigBean;
import com.lichuandi.springboot2021.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther digege
 * @Date 2021/4/22
 * @Description：com.lichuandi.springboot2021.controller version：1
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class TestController {
    @Autowired
    User user;
    @RequestMapping(value = "/user")
    public String user(){
        return user.getName()+"-"+user.getAge();
    }
}
