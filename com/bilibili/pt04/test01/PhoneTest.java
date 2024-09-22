package com.bilibili.pt04.test01;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();

        //赋值
        p.brand = "小米";
        p.price = 3999;

        //获取值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用方法
        p.call();
        p.playGame();
    }

}
