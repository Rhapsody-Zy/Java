package com.bilibili.pt07.test16.demo3;

public class Outer {

    int a = 10;
    static int b = 20;

    static class Inner {
        public void show1() {
            //静态内部类调用外部类中非静态的变量和方法，需要创建外部类的对象
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
        }

        public static void show2() {
            //静态内部类调用外部类中非静态的变量和方法，需要创建外部类的对象
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
        }
    }

}
