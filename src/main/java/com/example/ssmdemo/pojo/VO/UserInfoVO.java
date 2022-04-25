package com.example.ssmdemo.pojo.VO;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfoVO {
    private Integer id;
    private String username;
    private String name;
    private String status;
    private Date sendTime;
}
