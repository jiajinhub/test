package com.example.springbootWithPostgresql.controller;


import com.example.springbootWithPostgresql.entity.UserEntity;
import com.example.springbootWithPostgresql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getAllUser(){
        List<UserEntity> users = userService.getAllUser();
        System.out.println("users : "+users);
        return users;
    }


}
