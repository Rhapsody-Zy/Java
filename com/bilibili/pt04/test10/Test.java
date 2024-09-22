package com.bilibili.pt04.test10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入
        //第一套体系
        //nextInt(); 接受整数
        //nextDouble(); 接受小数
        //next(); 接收字符串
        //遇到空格、制表符、回车就停止接收。这些符号后面的数据就不会接收了


        //第二套体系
        //nextLine(); 接收字符串
        //可以接收空格、制表符，遇到回车才停止接收数据


        //键盘录入的两套体系不能混用
        //弊端：先用nextInt，再用nextLine会导致下面的nextLine接收不到数据

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();
        System.out.println(num1);
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        System.out.println(num2);
        //123 123

    }
}
