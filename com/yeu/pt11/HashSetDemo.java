package com.yeu.pt11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//哈希集
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("apple");
        set.add("big");
        int size = set.size();
        System.out.println(size);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
