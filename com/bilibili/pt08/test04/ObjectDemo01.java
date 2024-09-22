package com.bilibili.pt08.test04;

public class ObjectDemo01 {

    public static void main(String[] args) {

        //1.toString 返回对象的字符串表达形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);   //java.lang.Object@4eec7777

        Student student = new Student();
        String str2 = student.toString();
        System.out.println(str2);
        System.out.println(student);

        //打印输出的细节
        //System - 类名
        //out - 静态变量
        //System.out - 获取打印的对象
        //println() - 方法
        //参数 - 打印的内容
        //核心逻辑：当我们打印一个对象的时候，底层会调用对象的toString方法，把对象变成字符串
        //  然后再打印在控制台上，打印完毕换行处理

        //默认情况下打印一个对象打印的是地址值
        //可以通过重写toString的方法，打印对象的属性值

     }


}
