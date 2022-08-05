package com.zyh;

import com.zyh.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        //运行工厂
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //工厂中获取对象
        UserService tbUserService =(UserService) context.getBean("userServiceImpl");
        //调用方法
        tbUserService.findAll().forEach(System.out::println);
    }
}
