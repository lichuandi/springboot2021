package com.lichuandi.springboot2021.entity;

import lombok.Cleanup;
import lombok.Data;

import javax.persistence.*;

/**
 * @Auther digege
 * @Date 2021/4/22
 * @Description：com.lichuandi.springboot2021.entity version：1
 */
@Entity
@Data
public class JPAUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(nullable = false,unique = true)
    private String username;
    @Column
    private String password;

}
