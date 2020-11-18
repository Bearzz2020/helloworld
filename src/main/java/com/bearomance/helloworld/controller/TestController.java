package com.bearomance.helloworld.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bearomance.helloworld.model.entity.User;
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
        Page<User> page = new Page<>(1, 1);
        Page<User> userPage = userMapper.selectPage(page, null);
        return "Hello Bear";
    }
}
