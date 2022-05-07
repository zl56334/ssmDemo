package com.example.ssmdemo.common.security;

import cn.hutool.json.JSONUtil;

import com.example.ssmdemo.module.sys.pojo.Result;
import com.example.ssmdemo.module.sys.pojo.ResultCode;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 认证失败处理类
 */
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        System.out.println("认证失败");
        Result r = new Result();
        r.code(ResultCode.UNAUTHORIZED).message("认证失败");
        String json =  JSONUtil.toJsonStr(r);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }
}
