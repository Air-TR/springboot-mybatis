package com.tr.springboot.mybatis.mapper;

import com.tr.springboot.mybatis.entity.SysUser;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper {

    @Select("select * from sys_user where id=#{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class,
                    many = @Many(select = "com.tr.springboot.mybatis.mapper.SysRoleMapper.findByUid"))
    })
    SysUser findById(Integer id);

}
