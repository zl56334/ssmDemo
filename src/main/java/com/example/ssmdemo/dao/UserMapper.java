package com.example.ssmdemo.dao;

import com.example.ssmdemo.pojo.JwtUser;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Robod
 * @date 2020/8/9 17:44
 */
@Repository("userMapper")
public interface UserMapper{

    @Select("select * from sys_user where username=#{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class,
                    many = @Many(select = "com.example.ssmdemo.dao.RoleMapper.findByUid"))
    })
    public JwtUser findByUsername(String username);
}
