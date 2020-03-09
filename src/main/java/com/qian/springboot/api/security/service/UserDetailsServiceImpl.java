package com.qian.springboot.api.security.service;

import com.qian.springboot.api.entity.Role;
import com.qian.springboot.api.entity.User;
import com.qian.springboot.api.entity.UserRole;
import com.qian.springboot.api.security.entity.JwtUser;
import com.qian.springboot.api.service.IRoleService;
import com.qian.springboot.api.service.IUserRoleService;
import com.qian.springboot.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IUserRoleService userRoleService;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();

        User user = userService.selectByName(name);
        if (user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
//        // 添加权限
        List<UserRole> userRoles = userRoleService.listByUserId(user.getId());
        for (UserRole userRole : userRoles) {
            Role role = roleService.selectById(userRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        // 返回UserDetails实现类
        JwtUser jwtUser = new JwtUser(user.getId(),user.getName(),user.getPwd(),authorities);
        System.out.println(jwtUser);
        return jwtUser;
    }
}
