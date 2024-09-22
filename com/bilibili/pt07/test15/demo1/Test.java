package com.bilibili.pt07.test15.demo1;

import com.bilibili.pt07.test15.demo1.Frog;
import com.bilibili.pt07.test15.demo1.Rabbit;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙",1);
        f.Swim();

        Rabbit r = new Rabbit("小白",1);
        r.eat();
    }
}
