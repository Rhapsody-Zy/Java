package com.bilibili.pt12.a02Stream;

import java.util.ArrayList;

public class StreamDemo6 {
    public static void main(String[] args) {

        //Stream的方法
        //注意
        //中间方法返回的是新的stream流，原来的stream流只能使用一次，所以直接使用链式编程
        //修改stream流中的数据，是不会影响原来集合或者数组中的数据

        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("abc");
        list.add("ab");

        //filter - 过滤
        //使用stream获取所有以"a"开头的，并且长度为3的元素
        list.stream().filter(s->s.startsWith("a"))
                .filter(s->s.length() == 3)
                .forEach(s-> System.out.println(s));

        System.out.println("---------------------------");

        //limit - 获取前几个元素
        //skip - 跳过几个元素
        list.stream().limit(3).forEach(s -> System.out.println(s));
        list.stream().skip(2).forEach(s -> System.out.println(s));

    }
}
