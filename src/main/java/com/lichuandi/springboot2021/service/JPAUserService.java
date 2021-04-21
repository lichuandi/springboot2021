package com.lichuandi.springboot2021.service;

import com.lichuandi.springboot2021.dao.JPAUserDao;
import com.lichuandi.springboot2021.entity.JPAUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther digege
 * @Date 2021/4/22
 * @Description：com.lichuandi.springboot2021.service version：1
 */
@Service
public class JPAUserService {
    @Autowired
    private JPAUserDao userDao;
    public JPAUser findByUsername(String username){
        return userDao.findByUsername(username);
    }
}
