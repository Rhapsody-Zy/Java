package com.bilibili.pt07.test08;

public class Administrator extends Person{
    public Administrator() {
    }

    public Administrator(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("管理员的信息为:" + ", " + getName() + ", " + getAge());
    }
}
