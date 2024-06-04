package com.yeu.pt11.demo3;

import java.util.*;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        set.add(new Product(110,"台灯",100));
        set.add(new Product(110,"台灯",100));
        set.add(new Product(110,"台灯",100));
        set.add(new Product(110,"台灯",100));
        Iterator<Product> iterator = set.iterator();
        while (iterator.hasNext()) {
            Product next = iterator.next();
            System.out.println(next);
        }
    }
}
