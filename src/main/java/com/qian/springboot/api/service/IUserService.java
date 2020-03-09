package com.qian.springboot.api.service;

import com.qian.springboot.api.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author qian
 * @since 2020-03-05
 */
public interface IUserService extends IService<User> {
    User getUserByName(String username);

    void add(User user);

    User selectById(Integer id);

    User selectByName(String name);

}
