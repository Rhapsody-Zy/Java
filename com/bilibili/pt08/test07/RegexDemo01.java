package com.bilibili.pt08.test07;

public class RegexDemo01 {
    public static void main(String[] args) {

        //作用：1、校验字符串是否满足规则；
        //     2、在一段文本中查找满足要求的内容；


        //细节：如果要求两个范围的交集，那么需要写符号 &&
        //如果写成了一个 & ，那么此时&表示的就不是交集，而是一个简简单单的&符号
        System.out.println("a".matches("[a-z&[def]]"));     //true
        System.out.println("&".matches("[a-z&[def]]"));     //true
        System.out.println("&".matches("[a-z&&[def]]"));    //false


    }
}
