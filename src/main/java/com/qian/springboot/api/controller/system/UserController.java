package com.qian.springboot.api.controller.system;

import com.qian.springboot.api.base.BaseController;
import com.qian.springboot.api.entity.User;
import com.qian.springboot.api.mapper.UserMapper;
import com.qian.springboot.api.response.RestResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 系统用户表 前端控制器
 * </p>
 *
 * @author qian
 * @since 2020-03-04
 */
@RestController
@RequestMapping("/api")
public class UserController extends BaseController {

    @PostMapping("/get")
    public RestResponse getUser(@Param("username")String username){
        User user = userService.getUserByName(username);
        return RestResponse.succuess(user);
    }

    @PostMapping("/add")
    public RestResponse addUser(@RequestBody @Valid User user){
        userService.add(user);
        return RestResponse.succuess();
    }

    @PostMapping("/find")
    public RestResponse findById(@Param("id")Integer id){
        User user = userService.selectById(id);
        return RestResponse.succuess(user);
    }
}
