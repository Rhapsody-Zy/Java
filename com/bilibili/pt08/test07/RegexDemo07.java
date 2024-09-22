package com.bilibili.pt08.test07;

//识别正则的两个方法

public class RegexDemo07 {
    public static void main(String[] args) {

        //使用正则查找字符串并替换
        //replaceAll

        String s = "熏jaksdhfgadjhga椿sdihfjaoifhai有马";

        String result = s.replaceAll("[\\w&&[^_]]+", "Love");

        System.out.println(result);


        //使用正则查找字符串并切割
        //split

        String[] arr = s.split("[\\w&&[^_]]+");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
