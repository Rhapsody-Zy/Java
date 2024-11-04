package com.bilibili.pt12.a02Stream;

import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {

        //双列集合获取stream流

        //1.创建双列集合
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("a", 1);
        hm.put("b", 2);
        hm.put("c", 3);

        //第一种方法
        //hm.keySet().stream().forEach(s -> System.out.println(s));

        //第二种方法
        hm.entrySet().stream().forEach(s -> System.out.println(s));
    }
}
