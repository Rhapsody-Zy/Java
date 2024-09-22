package com.bilibili.pt08.test07;

public class RegexDemo09 {
    public static void main(String[] args) {
        //捕获分组 - 口吃替换

        String s = "今天你有多多多多多多多喜喜喜喜喜喜欢欢欢欢欢我我我我我";

        // (.) 把重复内容的第一个字符看作第一组
        // \\1 表示第一组内容再次出现
        // $1  表示把正则表达式中第一组的内容，再拿出来用
        String s1 = s.replaceAll("(.)\\1+", "$1");
        System.out.println(s1);


    }
}
