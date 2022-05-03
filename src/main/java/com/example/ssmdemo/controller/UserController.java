package com.example.ssmdemo.controller;

import com.example.ssmdemo.pojo.Result;
import com.example.ssmdemo.pojo.model.SysRole;
import com.example.ssmdemo.pojo.model.User;
import com.example.ssmdemo.service.RoleService;
import com.example.ssmdemo.service.UserService;
import com.example.ssmdemo.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @RequestMapping("/info")
    @ResponseBody
    public Result info(@RequestParam(value = "token") String token) {
        String username = jwtTokenUtil.getUsernameFromToken(token);
        User user = userService.getUserByName(username);
        List<String> roleNameList = roleService.findRoleNameByUid(user.getId());

        Result result = new Result();
        result.code(20000).message("success").data("name",user.getName()).data("avatar",user.getAvatar()).data("introduction",user.getIntroduction()).data("roles",roleNameList);
        return result;
    }
}
