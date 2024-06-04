package com.yeu.pt11.demo6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","zhangsan");
        map.put("2","lisi");
        map.put("3","wamgwu");

        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + value);
        }
    }
}
