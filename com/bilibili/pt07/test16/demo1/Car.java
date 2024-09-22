package com.bilibili.pt07.test16.demo1;

public class Car {
    private String carName;
    int carAge;
    String carColor;


    public void show() {
        System.out.println(carName);
        //调用内部类，需要创建方法
        Engine e = new Engine();
        System.out.println(e.engineName);

    }

    //成员内部类

    //成员内部类是可以被修饰符修饰的 private public protected
    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(carName);
            System.out.println(engineName);
        }
    }

    //获取内部类对象的方法
    //外部类编写方法，返回内部类对象 - 内部类被 private 修饰时使用

    public Engine getEngine() {
        return new Engine();
    }

}
