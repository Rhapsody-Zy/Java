package com.bilibili.service.impl;

import com.bilibili.mapper.DeptMapper;
import com.bilibili.pojo.Dept;
import com.bilibili.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public void delete(Integer id) {
        deptMapper.deleteById(id);
    }

    @Override
    public void add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.insert(dept);
    }

    @Override
    public Dept select(Integer id) {
        return deptMapper.selectById(id);
    }

    @Override
    public void update(Integer id, String name) {
        deptMapper.update(id, name);
    }

}
