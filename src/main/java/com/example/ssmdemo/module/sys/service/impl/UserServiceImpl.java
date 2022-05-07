package com.example.ssmdemo.module.sys.service.impl;

import com.example.ssmdemo.module.sys.dao.UserDao;
import com.example.ssmdemo.module.sys.pojo.model.User;
import com.example.ssmdemo.module.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public List<Map<String, Object>> getUserRoleListById(Integer id){
    	return userDao.selectUserRoleById(id);
    }
}
