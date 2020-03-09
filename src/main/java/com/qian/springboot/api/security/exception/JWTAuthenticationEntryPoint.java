package com.qian.springboot.api.security.exception;

import cn.hutool.json.JSONObject;
import com.qian.springboot.api.response.ResultCode;
import org.springframework.security.core.AuthenticationException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class JWTAuthenticationEntryPoint implements org.springframework.security.web.AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException {

        /**
         * 当用户尝试访问需要权限才能的REST资源而不提供Token或者Token错误或者过期时，
         * 将调用此方法发送401响应以及错误信息
         */
//        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", ResultCode.TOKEN_INVALID.code());
        map.put("msg",ResultCode.TOKEN_INVALID.message());
        JSONObject json = new JSONObject(map);
        //设置response类型
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        //将数据写到response body中
        response.getWriter().write(String.valueOf(json));
    }
}
