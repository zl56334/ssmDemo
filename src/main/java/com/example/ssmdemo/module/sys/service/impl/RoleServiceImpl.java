package com.example.ssmdemo.module.sys.service.impl;

import com.example.ssmdemo.module.sys.dao.RoleDao;
import com.example.ssmdemo.module.sys.pojo.model.SysRole;
import com.example.ssmdemo.module.sys.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<SysRole> findByUid(Integer uid) {
        return roleDao.findByUid(uid);
    }

    @Override
    public List<String> findRoleNameByUid(Integer uid) {
        return roleDao.findRoleNameByUid(uid);
    }
}
