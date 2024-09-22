package com.bilibili.pt05.test12;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        //获取容量
        System.out.println(sb.capacity());  //16
        //获取长度
        System.out.println(sb.length());    //0

        sb.append("abc");

    }
}
