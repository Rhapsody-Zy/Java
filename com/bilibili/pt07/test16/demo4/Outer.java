package com.bilibili.pt07.test16.demo4;

public class Outer {

    int b = 20;

    public void show() {

        int a = 10;

        //局部内部类
        class Inner {
            String name;
            int age;

            public void method1() {
                //可以直接访问外部类的成员，也可以访问方法内的局部变量
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类中的method1方法");
            }

            public static void method2() {
                System.out.println("局部内部类中的method2方法");
            }

        }

        //创建局部内部类的变量
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        //静态方法可以直接调用，但非静态的就需要创建对象进行调用
        Inner.method2();



    }

}
