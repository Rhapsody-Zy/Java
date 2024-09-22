package com.bilibili.pt07.test16.demo5;

public class Test2 {
    public static void main(String[] args) {

        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("重写之后swim方法");
            }
        };
        s.swim();


        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写之后swim方法");
            }
        }.swim();


    }
}
