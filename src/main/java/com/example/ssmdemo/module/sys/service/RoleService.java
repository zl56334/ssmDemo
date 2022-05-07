package com.example.ssmdemo.module.sys.service;

import com.example.ssmdemo.module.sys.pojo.model.SysRole;

import java.util.List;

public interface RoleService {
    List<SysRole> findByUid(Integer uid);

    List<String> findRoleNameByUid(Integer uid);
}
