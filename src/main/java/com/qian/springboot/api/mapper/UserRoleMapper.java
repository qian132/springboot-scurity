package com.qian.springboot.api.mapper;

import com.qian.springboot.api.entity.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qian
 * @since 2020-03-05
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<UserRole> listByUserId(Integer userId);
}
