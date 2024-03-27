package com.cxl.ch1;

public class MyTest {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.length = 10.0;
        System.out.println("s1的边长为：" + s1.length);
        System.out.println("s1的边长为：" + s1.area());
    }
}
