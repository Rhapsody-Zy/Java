package com.bilibili.pt05.test13;

//罗马数字转换

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一串字符串");
            str = sc.next();

            boolean check = checkStr(str);

            if (check) {
                break;
            }else {
                System.out.println("字符串不合法");
                continue;
            }
        }

        //查表法
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 48;

            if (i == str.length() - 1) {
                sb = sb.append(getRoman(index));
            }else {
                sb = sb.append(getRoman(index)).append(", ");
            }
        }
        System.out.println(sb.toString());
    }

    //输出对应的罗马数字
    public static String getRoman(int index) {
        String[] arr = {" ","I","II","III","IV","V","VI","VII","VM","IX"};
        return arr[index];
    }

    /*//第二种方法 switch
    public static String getRoman(char index) {
        String str = switch (index) {
            case '0' -> "";
            case '1' -> "I";
            case '2' -> "II";
            case '3' -> "III";
            case '4' -> "IV";
            case '5' -> "V";
            case '6' -> "VI";
            case '7' -> "VII";
            case '8' -> "VM";
            case '9' -> "IX";
            default -> "";
        }
        return str;
    }*/

    //判断字符串是否符合要求
    public static boolean checkStr(String str) {
        if (str.length() >= 9) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
