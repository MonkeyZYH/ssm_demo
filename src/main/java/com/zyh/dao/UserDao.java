package com.zyh.dao;

import com.zyh.entity.User;

import java.util.List;

public interface UserDao {
    //保存
    void save(User user);
    //查询所有
    List<User> findAll();
}
