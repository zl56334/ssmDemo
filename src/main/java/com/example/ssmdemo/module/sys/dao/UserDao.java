package com.example.ssmdemo.module.sys.dao;

import com.example.ssmdemo.module.sys.pojo.JwtUser;
import com.example.ssmdemo.module.sys.pojo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository("userMapper")
public interface UserDao {

    @Select("select id,username,password,status from sys_user where username=#{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class,
                    many = @Many(select = "com.example.ssmdemo.module.sys.dao.RoleDao.findByUid"))
    })
    public JwtUser findByUsername(String username);

    public Integer insertUser(User user);
    public Integer updateUser(User user);
    public Integer deleteUser(Integer id);
    public User selectUserById(Integer id);
    public User selectUserByName(String name);
    public List<User> getUserList();
    public List<Map<String,Object>> selectUserRoleById(Integer name);
}
