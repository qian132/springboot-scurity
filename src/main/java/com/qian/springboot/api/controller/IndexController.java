package com.qian.springboot.api.controller;

import com.qian.springboot.api.base.BaseController;
import com.qian.springboot.api.response.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController extends BaseController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String showHome() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        logger.info("当前登陆用户：" + name);
        return "home";
    }
    //@PreAuthorize 用于判断用户是否有指定权限，没有就不能访问

    @RequestMapping("/test")
    public String printTest() {
        return "没有设置权限的访问";
    }


//    @PostMapping("/logout")
//    public RestResponse logout(){
//        return RestResponse.succuess();
//    }
}
