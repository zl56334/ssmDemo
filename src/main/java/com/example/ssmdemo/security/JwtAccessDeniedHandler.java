package com.example.ssmdemo.security;

import cn.hutool.json.JSONUtil;
import com.example.ssmdemo.pojo.Result;
import com.example.ssmdemo.pojo.ResultCode;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义无权访问处理类
 */
@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        Result r = new Result();
        r.code(ResultCode.FORBIDDEN).message("权限不足");
        String json =  JSONUtil.toJsonStr(r);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }
}
