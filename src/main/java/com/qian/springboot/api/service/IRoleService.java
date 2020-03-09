package com.qian.springboot.api.service;

import com.qian.springboot.api.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qian
 * @since 2020-03-05
 */
public interface IRoleService extends IService<Role> {
    Role selectById(Integer id);
}
