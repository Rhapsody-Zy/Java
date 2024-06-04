package com.yeu.pt12.demo02;

import java.util.*;

public class HashMapDemo02 {
    public static void main(String[] args) {
        Map<User,String> map = new TreeMap<>();
        map.put(new User(1,"Mary"),"泉州");
        map.put(new User(2,"Tom"),"苏州");
        map.put(new User(3,"Mark"),"上海");
        map.put(new User(3,"Jack"),"厦门");

        Set<User> users = map.keySet();
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            String s = map.get(next);
            System.out.println(next + s);
        }

    }
}
