package com.tr.springboot.mybatis.mapper;

import com.tr.springboot.mybatis.entity.SysRole;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleMapper {

//    @Update()
//    @Delete()
//    @Insert()
    @Select("select * from sys_role where id=#{id}")
    SysRole findById(Integer id);

    @Select("select * from sys_role")
    List<SysRole> findAll();

    @Select("SELECT r.id, r.role_name, r.role_desc " +
            "FROM sys_role r, sys_user_role ur " +
            "WHERE r.id=ur.rid AND ur.uid=#{uid}")
    List<SysRole> findByUid(Integer uid);

}
