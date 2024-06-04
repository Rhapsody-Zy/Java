package com.yeu.pt11.demo4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set<Double> set = new TreeSet<>();
        set.add(1.1);
        set.add(5.5);
        set.add(3.3);
        set.add(4.4);
        set.add(2.2);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
