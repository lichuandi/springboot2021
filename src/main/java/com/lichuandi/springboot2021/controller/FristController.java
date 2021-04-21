package com.lichuandi.springboot2021.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther digege
 * @Date 2021/4/21
 * @Description：com.lichuandi.springboot2021.controller version：1
 */
@RestController
public class FristController {
    @GetMapping("/hi")
    public String Hi(){
        return "lichuandi";
    }
}
