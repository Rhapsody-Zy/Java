package com.bilibili.service.impl;

import com.bilibili.mapper.EmpMapper;
import com.bilibili.pojo.Emp;
import com.bilibili.pojo.PageBean;
import com.bilibili.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin, LocalDate end) {
        //设置分页参数
        PageHelper.startPage(page,pageSize);

        //执行查询
        List<Emp> empList = empMapper.list(name, gender, begin, end);
        Page<Emp> p = (Page<Emp>) empList;
        long total = p.getTotal();
        List<Emp> list = p.getResult();

        //封装
        PageBean pageBean = new PageBean(total, list);
        return pageBean;
    }
}
