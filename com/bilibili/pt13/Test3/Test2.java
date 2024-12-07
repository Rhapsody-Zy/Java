package com.bilibili.pt13.Test3;

import java.io.*;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //添加功能 - 输错三次 账号锁定
        //登录
        BufferedReader br = new BufferedReader(new FileReader("W:\\Java\\com\\bilibili\\pt13\\Test3\\userinfo.txt"));
        String line = br.readLine();
        br.close();
        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");
        String[] arr3 = userInfo[2].split("=");

        String rightName = arr1[1];
        String rightPassword = arr2[1];
        int count = Integer.parseInt(arr3[1]);

        //用户输入

        if (count >= 3) {
            System.out.println("账号锁定");
            System.exit(0);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("用户名");
        String username = sc.nextLine();
        System.out.println("密码");
        String password = sc.nextLine();

        if (rightName.equals(username) && rightPassword.equals(password)) {
            System.out.println("密码对了");
            count = 0;
        } else {
            System.out.println("错了");
            count++;
        }
        String str = "username=" + rightName + "&password=" + rightPassword + "&count=" + count;

        BufferedWriter bw = new BufferedWriter(new FileWriter("W:\\Java\\com\\bilibili\\pt13\\Test3\\userinfo.txt", false));
        bw.write(str);
        bw.close();
    }
}
