package com.qian.springboot.api.security.exception;

import cn.hutool.json.JSONObject;
import com.qian.springboot.api.response.ResultCode;
import org.springframework.security.access.AccessDeniedException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class JWTAccessDeniedHandler implements org.springframework.security.web.access.AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse,
                       AccessDeniedException e) throws IOException {
        /**
         * 当用户尝试访问需要权限才能的REST资源而权限不足的时候，
         * 将调用此方法发送401响应以及错误信息
         */
        e = new AccessDeniedException("请先完成授权登陆");
//        httpServletResponse.sendError(HttpServletResponse.SC_FORBIDDEN, e.getMessage());
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", ResultCode.TOKEN_INVALID.code());
        map.put("msg",ResultCode.TOKEN_INVALID.message());
        JSONObject json = new JSONObject(map);
        //设置response类型
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json");
        //将数据写到response body中
        httpServletResponse.getWriter().write(String.valueOf(json));
    }
}
