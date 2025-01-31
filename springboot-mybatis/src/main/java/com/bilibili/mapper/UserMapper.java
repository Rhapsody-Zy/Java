package com.bilibili.mapper;

import com.bilibili.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    
    @Select("select id from mybatis.user")
    public List<User> list();

}
