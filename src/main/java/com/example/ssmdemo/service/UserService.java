package com.example.ssmdemo.service;

import com.example.ssmdemo.pojo.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    Integer addUser(User user);

    Integer updateUser(User user);

    Integer deleteUser(User user);

    User getUser(User user);

    User getUserByName(String name);

    User getUserById(Integer id);

    List<User> getUserList();

    List<Map<String,Object>> getUserRoleListById(Integer id);
}
