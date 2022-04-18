package com.example.ssmdemo.dao;

import com.example.ssmdemo.pojo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public Integer insertUser(User user);
    public Integer updateUser(User user);
    public Integer deleteUser(Integer id);
    public User selectUserById(Integer id);
    public User selectUserByName(String name);
    public List<User> getUserList();
}
