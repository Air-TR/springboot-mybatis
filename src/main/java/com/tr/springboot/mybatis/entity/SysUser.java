package com.tr.springboot.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author taorun
 * @date 2023/1/29 11:06
 */
public class SysUser {

    private Integer id;
    private String username;
    private String password;
    private Integer status;

    private List<SysRole> roles = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}
