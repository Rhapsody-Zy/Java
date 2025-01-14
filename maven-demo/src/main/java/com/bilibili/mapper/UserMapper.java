package com.bilibili.mapper;

import com.bilibili.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById(int id);
}
