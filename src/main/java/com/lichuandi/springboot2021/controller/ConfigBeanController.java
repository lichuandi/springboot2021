package com.lichuandi.springboot2021.controller;

import com.lichuandi.springboot2021.configBean.ConfigBean;
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
@EnableConfigurationProperties({ConfigBean.class})
public class ConfigBeanController {
    @Autowired
    ConfigBean configBean;
    @RequestMapping(value = "/lichuandi")
    public String myName(){
        return configBean.getGreeting()+"-"+configBean.getName()+"-"+configBean.getUuid()+"-"+configBean.getMax();
    }
}
