package com.example.ssmdemo.dao;

import com.example.ssmdemo.pojo.model.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Robod
 * @date 2020/8/9 17:43
 */
@Mapper
@Repository("roleMapper")
public interface RoleDao {

    @Select("SELECT r.id, r.role_name roleName, r.role_desc roleDesc " +
            "FROM sys_role r, sys_user_role ur " +
            "WHERE r.id=ur.rid AND ur.uid=#{uid}")
    public List<SysRole> findByUid(Integer uid);

    @Select("SELECT r.role_name as roleName " +
            "FROM sys_role r, sys_user_role ur " +
            "WHERE r.id=ur.rid AND ur.uid=#{uid}")
    public List<String> findRoleNameByUid(Integer uid);

}
