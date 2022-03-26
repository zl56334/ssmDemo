package com.example.ssmdemo.security;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.example.ssmdemo.pojo.Result;
import com.example.ssmdemo.pojo.ResultCode;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        returnFailure(httpServletResponse);
    }
    public void returnFailure(HttpServletResponse response) throws IOException{
        Result r = new Result();
        r.code(ResultCode.UNAUTHORIZED).message("认证失败");
        // 使用fastjson
        String json =  JSONUtil.toJsonStr(r);
        // 指定响应格式是json
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }
}