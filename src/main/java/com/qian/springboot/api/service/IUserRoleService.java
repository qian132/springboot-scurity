package com.qian.springboot.api.service;

import com.qian.springboot.api.entity.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qian
 * @since 2020-03-05
 */
public interface IUserRoleService extends IService<UserRole> {
    List<UserRole> listByUserId(Integer userId);
}
