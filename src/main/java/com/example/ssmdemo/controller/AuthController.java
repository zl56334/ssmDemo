package com.example.ssmdemo.controller;

import com.example.ssmdemo.pojo.Result;
import com.example.ssmdemo.pojo.ResultCode;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class AuthController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @PreAuthorize("hasAuthority('admin')")
    @RequestMapping("/del")
    public String del(){
        return "删除成功";
    }
}
