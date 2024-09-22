package com.bilibili.pt07.test15.demo1;

public class Frog extends Animal implements Swim {

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void Swim() {
        System.out.println("青蛙蛙泳");
    }
}
