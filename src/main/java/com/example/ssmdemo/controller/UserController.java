package com.example.ssmdemo.controller;

import com.example.ssmdemo.utils.JwtTokenUtil;
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

    @RequestMapping("/info")
    @ResponseBody
    public String info(@RequestParam(value = "token") String token) {
        String username = jwtTokenUtil.getUsernameFromToken(token);

        return "user/info";
    }
}
