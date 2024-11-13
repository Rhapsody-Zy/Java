package com.bilibili.pt12.a04Exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        /*
        JVM默认处理异常的方式
            把异常的名称，异常的原因及异常出现的位置等信息输出在了控制台
            程序停止执行，异常下面的代码就不会执行了
        */

        System.out.println("aaa");
        System.out.println(2/0);    //算数异常ArithmeticException
        System.out.println("bbb");
        System.out.println("ccc");

    }
}
