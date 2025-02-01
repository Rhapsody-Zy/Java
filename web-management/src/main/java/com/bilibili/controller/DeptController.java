package com.bilibili.controller;

import com.bilibili.pojo.Dept;
import com.bilibili.pojo.Result;
import com.bilibili.service.DeptService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.json.JSONObject;

import java.util.List;

@Slf4j
@RestController
public class DeptController {

    //调用日志
    /*private static Logger log = LoggerFactory.getLogger(DeptController.class);*/

    @Autowired
    public DeptService deptService;

    /*查询部门数据*/
    /*@RequestMapping(value = "/depts",method = RequestMethod.GET)    //指定请求的方式为GET*/
    @GetMapping("/depts")
    public Result list(){
        log.info("查询全部的部门数据");

        //调用service层来查询部门数据
        List<Dept> deptList = deptService.list();

        return Result.success(deptList);
    }

    /*删除部门*/
    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据部门id删除部门：{}", id);

        deptService.delete(id);

        return Result.success();
    }

    /*添加部门*/
    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
        log.info("新增部门：{}", dept);

        deptService.add(dept);
        return Result.success();
    }

    /*根据id查找部门*/
    @GetMapping("/depts/{id}")
    public Result select(@PathVariable Integer id){
        log.info("根据id查找部门：{}", id);

        Dept dept = deptService.select(id);

        return Result.success(dept);
    }

    /*修改部门*/
    @PutMapping("/depts")
    public Result update(@RequestBody String json){
        JSONObject jsonObject = new JSONObject(json);
        Integer id = jsonObject.getInt("id");
        String name = jsonObject.getString("name");
        log.info("修改id为{}部门的部门为{}", id, name);
        deptService.update(id,name);
        return Result.success();
    }

}
