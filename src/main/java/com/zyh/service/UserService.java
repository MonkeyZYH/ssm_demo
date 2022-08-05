package com.zyh.service;

import com.zyh.entity.User;

import java.util.List;

public interface UserService {

    void save(User user);

    List<User> findAll();
}
