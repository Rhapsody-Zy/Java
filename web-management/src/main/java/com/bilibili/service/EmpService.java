package com.bilibili.service;

import com.bilibili.pojo.Emp;
import com.bilibili.pojo.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public interface EmpService {
    /*分页查找*/
    PageBean page(Integer page, Integer pageSize,String name, Short gender, LocalDate begin, LocalDate end);

    /*删除*/
    void delete(List<Integer> ids);

    void save(Emp emp);
}
