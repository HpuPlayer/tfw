package com.example.tfw.controller;

import com.example.tfw.mapper.UserMapper;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation("普通测试")
    public String commonTest(){
        return userMapper.selectUserByUUID("123").toString();
    }
    
    @GetMapping("/commitGit")
    public String githubTest(){
        return "success";
    }
}
