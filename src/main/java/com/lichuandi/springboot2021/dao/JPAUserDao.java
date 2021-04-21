package com.lichuandi.springboot2021.dao;

import com.lichuandi.springboot2021.entity.JPAUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther digege
 * @Date 2021/4/22
 * @Description：com.lichuandi.springboot2021.dao version：1
 */
public interface JPAUserDao extends JpaRepository<JPAUser,Long> {
    JPAUser findByUsername(String username);
}
