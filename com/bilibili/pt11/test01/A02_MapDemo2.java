package com.bilibili.pt11.test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map的第一种遍历方式

        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        //通过键找值
        //获取所有的键，把这些键放在一个set集合中
        Set<String> keys = map.keySet();
        /*for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + " + " + value);
        }*/

        /*Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }*/

        keys.forEach(key -> {
                String value = map.get(key);
                System.out.println(key + " = " + value);
            }
        );

    }
}
