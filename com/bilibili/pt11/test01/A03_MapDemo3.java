package com.bilibili.pt11.test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");

        //Map的第二种遍历方式
        //通过键值对对象进行遍历
        //通过一个方法获取所有的键值对对象，返回一个set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //遍历entries这个集合，获得每一个键值对对象
        /*for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }*/

        /*Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + " = " + next.getValue());
        }*/

        entries.forEach(stringStringEntry -> {System.out.println(stringStringEntry.getKey()
                + " = " + stringStringEntry.getValue());
            }
        );
    }
}
