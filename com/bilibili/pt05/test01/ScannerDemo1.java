package com.bilibili.pt05.test01;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数:");
        double result = sc.nextDouble();
        System.out.println(result);
    }
}
