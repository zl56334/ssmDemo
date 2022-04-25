package com.example.ssmdemo.service.impl;

import com.example.ssmdemo.dao.UserDao;
import com.example.ssmdemo.pojo.model.User;
import com.example.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

    @Override
    public Integer addUser(User user) {
        return null;
    }

    @Override
    public Integer updateUser(User user) {
        return null;
    }

    @Override
    public Integer deleteUser(User user) {
        return null;
    }

    @Override
    public User getUser(User user) {
        return null;
    }

    @Override
    public User getUserByName(String name) {
        return userDao.selectUserByName(name);
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return null;
    }
}
