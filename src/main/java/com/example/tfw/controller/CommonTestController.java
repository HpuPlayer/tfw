package com.example.tfw.controller;

import com.example.tfw.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commonTest")
public class CommonTestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public String commonTest(){
        return userMapper.selectByUUID().toString();
    }
}
