package com.bilibili.pt11.test01;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A04_MapDemo4 {
    public static void main(String[] args) {

        //Map集合的第三种遍历方式

        Map<String,String> map = new HashMap<>();

        //添加元素
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        //利用lambda表达式进行遍历
        //底层就是利用entrySet进行的遍历
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " = " + value);
            }
        });

        System.out.println("---------------------------------");

        map.forEach(( key, value) -> System.out.println(key + " = " + value));
    }
}
