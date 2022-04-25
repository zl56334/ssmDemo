package com.example.ssmdemo.controller;

import com.example.ssmdemo.pojo.Result;
import com.example.ssmdemo.pojo.model.User;
import com.example.ssmdemo.service.UserService;
import com.example.ssmdemo.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserService userService;

    @RequestMapping("/info")
    @ResponseBody
    public Result info(@RequestParam(value = "token") String token) {
        String username = jwtTokenUtil.getUsernameFromToken(token);
        User user = userService.getUserByName(username);
        Result result = new Result();
        result.code(200).message("success").data("userinfo",user);
        return result;
    }
}
