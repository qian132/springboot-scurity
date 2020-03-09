package com.qian.springboot.api.service.impl;

import com.qian.springboot.api.entity.User;
import com.qian.springboot.api.mapper.UserMapper;
import com.qian.springboot.api.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author qian
 * @since 2020-03-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User getUserByName(String username) {
        User user = query().eq("name", username).one();
        return user;
    }

    @Override
    public void add(User user) {
//        baseMapper.selectById();
    }

    @Override
    public User selectById(Integer id) {
        return baseMapper.selectByUserId(id);
    }

    @Override
    public User selectByName(String name) {
        return baseMapper.selectByName(name);
    }
}
