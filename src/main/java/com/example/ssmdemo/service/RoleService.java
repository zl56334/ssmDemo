package com.example.ssmdemo.service;

import com.example.ssmdemo.pojo.model.SysRole;

import java.util.List;

public interface RoleService {
    List<SysRole> findByUid(Integer uid);

    List<String> findRoleNameByUid(Integer uid);
}
