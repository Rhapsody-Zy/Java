package com.bilibili.pt07.test15.demo1;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void Swim() {
        System.out.println("狗刨式");
    }
}
