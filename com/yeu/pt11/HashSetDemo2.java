package com.yeu.pt11;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        set.add('b');
        set.add('e');
        set.add('a');
        set.add('c');
        for (Character c : set) {
            System.out.println(c);
        }
    }

}
