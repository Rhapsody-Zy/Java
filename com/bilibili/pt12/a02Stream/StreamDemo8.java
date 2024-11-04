package com.bilibili.pt12.a02Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {

        ////Stream的方法

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a-1","b-2","c-3","d-4");

        //map - 转换流中的数据类型
        //第一个类型：转换之前的数据类型
        //第二个类型：转换之后的数据类型
        list1.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.println(s));

        //链式编程
        list1.stream().map(s ->
                        Integer.parseInt(s.split("-")[1]))
                        .forEach(s -> System.out.println(s));
    }
}
