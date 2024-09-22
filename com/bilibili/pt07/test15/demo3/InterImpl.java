package com.bilibili.pt07.test15.demo3;

public class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("实现类的重写方法");
    }

    //此时可以选择性重写接口中的show方法

    @Override
    public void show() {
        System.out.println("重写接口中的show");
    }
}
