package com.qian.springboot.api.service.impl;

import com.qian.springboot.api.entity.Role;
import com.qian.springboot.api.mapper.RoleMapper;
import com.qian.springboot.api.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qian
 * @since 2020-03-05
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Override
    public Role selectById(Integer id) {
       return baseMapper.selectById(id);
    }
}
