package com.qian.springboot.api.mapper;

import com.qian.springboot.api.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 系统用户表 Mapper 接口
 * </p>
 *
 * @author qian
 * @since 2020-03-05
 */
public interface UserMapper extends BaseMapper<User> {
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    User selectByUserId(Integer id);

    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    User selectByName(String name);
}
