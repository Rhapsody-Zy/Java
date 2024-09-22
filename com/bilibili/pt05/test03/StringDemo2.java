package com.bilibili.pt05.test03;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.定义两个变量记录正确的用户名和密码
        String rightUsername = "Dayi";
        String rightPassword = "123456";

        for (int i = 0; i < 3; i++) {
            Scanner sc= new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            //3.比较
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            }else {
                if (i == 2) {
                    System.out.println("账号:"+ username + "被锁定。" );
                }else {
                    System.out.println("用户名或密码错误，您还剩下"+ (2-i) + "次机会。");
                }
            }
        }
    }


}

