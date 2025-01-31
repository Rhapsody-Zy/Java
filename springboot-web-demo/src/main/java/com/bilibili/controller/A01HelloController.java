package com.bilibili.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
@RestController
public class A01HelloController {
    @RequestMapping("/hello")
    public String Hello() {
        System.out.println("Hello World");
        return "Hello World";
    }
}
