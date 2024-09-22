package com.bilibili.pt05.test13;

//打乱字符串

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串");
        String str = sc.next();

        String result = changeStr(str);
        System.out.println(result);

    }

    public static String changeStr(String str) {
        char[] arr = str.toCharArray();
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(str.length());
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String result = new String(arr);
        return result;
    }
}
