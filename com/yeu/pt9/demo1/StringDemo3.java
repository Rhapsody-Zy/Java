package com.yeu.pt9.demo1;

public class StringDemo3 {

    public static void test1(String s) {
        s = "hello" + s;
    }

    public static void test1(StringBuffer stringBuffer) {
        stringBuffer = stringBuffer.append("hello");
    }

    public static void main(String[] args) {
        String s = "jack";
        test1(s);
        System.out.println(s);
        StringBuffer stringBuffer = new StringBuffer("tom");
        test1(stringBuffer);
        System.out.println(stringBuffer);
    }
}
