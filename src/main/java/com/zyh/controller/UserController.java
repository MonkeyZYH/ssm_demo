package com.zyh.controller;

import com.zyh.entity.User;
import com.zyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  //代表类中返回值转为json响应到浏览器
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/select")
    public List<User> findAll(){
        List<User> all = userService.findAll();
        return all;
    }

    @RequestMapping("/save")
    public void save(User user){
        userService.save(user);
    }
}
