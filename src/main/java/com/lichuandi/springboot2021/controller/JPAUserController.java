package com.lichuandi.springboot2021.controller;

import com.lichuandi.springboot2021.entity.JPAUser;
import com.lichuandi.springboot2021.service.JPAUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther digege
 * @Date 2021/4/22
 * @Description：com.lichuandi.springboot2021.controller version：1
 */
@RequestMapping("/user")
@RestController
public class JPAUserController {
     @Autowired
    JPAUserService jpaUserService;
    @GetMapping("/username/{username}")
    public JPAUser getUser(@PathVariable("username")String username){
     return jpaUserService.findByUsername(username);
 }
}
