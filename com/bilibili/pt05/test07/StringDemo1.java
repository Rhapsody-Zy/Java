package com.bilibili.pt05.test07;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号");
        String phoneNumber = sc.next();

        //2.截取手机号前三位
        String start = phoneNumber.substring(0,3);
        //截取手机号码后四位
        String end = phoneNumber.substring(7);

        String result = start + "****" + end;
        System.out.println(result);
    }
}
