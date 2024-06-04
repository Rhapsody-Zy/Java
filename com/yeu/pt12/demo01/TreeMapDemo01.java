package com.yeu.pt12.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("1","张三");
        map.put("2","王五");
        map.put("3","李四");
        map.put("4","李武");
        map.put("5","赵六");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + value);
        }


        System.out.println("------------------");
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + value);
        }

    }


}
