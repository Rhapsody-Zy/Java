package com.yeu.pt4;

class StaticTest {
    public static boolean foo(char c) {
        System.out.print(c);
        return true;
    }
}

public class MyTest {
    public static void main(String[] args) {
        boolean returnValue = StaticTest.foo('A');
        System.out.println("\nfoo方法的返回值：" + returnValue);
    }
}

