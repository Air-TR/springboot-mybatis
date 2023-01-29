package com.tr.springboot.mybatis.controller;

import com.tr.springboot.mybatis.entity.SysRole;
import com.tr.springboot.mybatis.entity.SysUser;
import com.tr.springboot.mybatis.mapper.SysRoleMapper;
import com.tr.springboot.mybatis.mapper.SysUserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author taorun
 * @date 2023/1/29 11:06
 */
@RestController
public class MybatisController {

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysRoleMapper sysRoleMapper;

    @GetMapping("/user/{id}")
    public SysUser findUserById(@PathVariable Integer id) {
        return sysUserMapper.findById(id);
    }

    @GetMapping("/role/{id}")
    public SysRole findRoleById(@PathVariable Integer id) {
        return sysRoleMapper.findById(id);
    }

    @GetMapping("/role/all")
    public List<SysRole> findAllRoles() {
        return sysRoleMapper.findAll();
    }

}
