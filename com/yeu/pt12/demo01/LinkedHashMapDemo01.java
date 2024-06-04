package com.yeu.pt12.demo01;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"hello");
        map.put(22,"world");
        map.put(33,"like");
        map.put(4,"rain");

        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            String s = map.get(next);
            System.out.println(next + " " + s);
        }


    }
}
