package com.bilibili.controller;

import com.bilibili.pojo.Emp;
import com.bilibili.pojo.PageBean;
import com.bilibili.pojo.Result;
import com.bilibili.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    /*分页查找员工*/
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, Short gender,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
        log.info("分页查询，参数为：{}，{}，{}，{}，{}", page, pageSize, name, gender, begin, end);

        PageBean pageBean = empService.page(page,pageSize, name, gender, begin, end);

        return Result.success(pageBean);
    }

    /*删除员工*/
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        log.info("删除id为{}的员工",ids);
        empService.delete(ids);
        return Result.success();
    }

    /*添加员工*/
    @PostMapping
    public Result save(@RequestBody Emp emp){
        log.info("新增员工，emp:{}", emp);
        empService.save(emp);
        return Result.success();

    }

}
