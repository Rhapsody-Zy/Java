package com.bilibili.controller;

import com.bilibili.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A03ResponseControlled {

    @RequestMapping("/hello2")
    public Result hello(){
        System.out.println("hello");
        return Result.success("hello");
    }



}
