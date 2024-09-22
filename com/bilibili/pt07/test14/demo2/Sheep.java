package com.bilibili.pt07.test14.demo2;

public class Sheep extends Animal{

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃++");
    }
}
