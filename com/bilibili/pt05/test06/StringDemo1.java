package com.bilibili.pt05.test06;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            }else {
                System.out.println("金额无效");
            }
        }

        //定义一个变量用来表示钱的大写
        String moneyStr = "";

        //2.得到money中的每一位数字
        while (true) {
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            //把转换后的大写拼接到moneyStr中
            moneyStr = capitalNumber + moneyStr;

            //去掉尾数
            money = money / 10;

            //如果数字上的每一位全部获取到了，那么money记录的就是0，此时循环结束
            if (money == 0) {
                break;
            }
        }

        //3.在前面补零，凑够7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        //4.插入单位
        //定义一个数组表示单位
        String result = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }

        System.out.println(result);

    }

    public static String getCapitalNumber(int number) {
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }

}
