package com.bearomance.helloworld.controller;

import com.bearomance.helloworld.model.User;
import com.bearomance.helloworld.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/t1")
    public String t1() {
        List<User> users = userMapper.selectList(null);
        return "Hello Bear";
    }
}
