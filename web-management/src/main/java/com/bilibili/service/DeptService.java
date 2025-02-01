package com.bilibili.service;

import com.bilibili.pojo.Dept;

import java.util.List;


public interface DeptService {
    /*查询全部部门数据*/
    public List<Dept> list();

    /*删除部门*/
    void delete(Integer id);

    //新增部门
    void add(Dept dept);

    //根据部门id查找部门
    Dept select(Integer id);

    void update(Integer id, String name);
}
