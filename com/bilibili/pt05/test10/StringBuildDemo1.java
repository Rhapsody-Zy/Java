package com.bilibili.pt05.test10;

import java.util.Scanner;

public class StringBuildDemo1 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //2.反转
        String result = new StringBuilder().append(str).reverse().toString();

        //3.比较
        if (str.equals(result)) {
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }
    }
}
