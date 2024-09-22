package com.bilibili.Util;

import java.util.Random;

public class CodeUtil {

    private CodeUtil() {}

    public static String getCode() {
        Random r = new Random();
        String yzm = "";
        for (int i = 0; i < 4; i++) {
            int a = r.nextInt(2);
            switch (a) {
                case 0 -> {
                    char c = (char)(r.nextInt(26)+65);
                    yzm = yzm +c;
                    break;
                }
                case 1 -> {
                    char c = (char)(r.nextInt(26)+97);
                    yzm = yzm +c;
                    break;
                }
            }
        }
        String temp = Integer.toString(r.nextInt(10));
        char c = temp.charAt(0);
        int index = r.nextInt(4);
        String start = yzm.substring(0,index);
        String end = yzm.substring(index);
        return start + c + end;
    }

}
