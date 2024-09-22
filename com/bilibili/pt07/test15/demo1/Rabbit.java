package com.bilibili.pt07.test15.demo1;

import com.bilibili.pt07.test15.demo1.Animal;

public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }
}
