package com.bilibili.pt13.a03CharSet;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        //编码 - getBytes()

        String str = "ai你";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        //解码
        String str2 = new String(bytes);
        System.out.println(str2);

        String str3 = new String(bytes1,"GBK");
        System.out.println(str3);

    }
}
