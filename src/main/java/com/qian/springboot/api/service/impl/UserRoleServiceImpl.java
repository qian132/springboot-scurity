package com.qian.springboot.api.service.impl;

import com.qian.springboot.api.entity.UserRole;
import com.qian.springboot.api.mapper.UserRoleMapper;
import com.qian.springboot.api.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qian
 * @since 2020-03-05
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

    @Override
    public List<UserRole> listByUserId(Integer userId) {
        return baseMapper.listByUserId(userId);
    }
}
