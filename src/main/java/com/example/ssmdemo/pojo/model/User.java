package com.example.ssmdemo.pojo.model;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String username;
    private String name;
    private String status;
    private String password;
    private String avatar;
    private String introduction;
    private List<SysRole> roleList;
}
