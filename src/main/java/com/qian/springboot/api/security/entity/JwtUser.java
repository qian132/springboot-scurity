package com.qian.springboot.api.security.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.NotNull;
import java.util.Collection;

public class JwtUser implements UserDetails {
    private Integer id;
    private String username;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public JwtUser(Integer id, @NotNull(message = "用户名不能为空") String name, String pwd, Collection<GrantedAuthority> authorities) {
        this.id=id;
        this.username = name;
        this.password =pwd;
        this.authorities =authorities;
    }

    /**
     * 通过 user 对象创建jwtUser
     */
//    public JwtUser(User user) {
//        id = user.getId();
//        username = user.getUsername();
//        password = user.getPassword();
//        authorities = user.getRoles();
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String toString() {
        return "JwtUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authorities=" + authorities +
                '}';
    }
}
