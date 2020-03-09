package com.qian.springboot.api.mapper;

import com.qian.springboot.api.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qian
 * @since 2020-03-05
 */
public interface RoleMapper extends BaseMapper<Role> {

    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    Role selectById(Integer id);
}
