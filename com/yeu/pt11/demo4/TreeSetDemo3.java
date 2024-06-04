/*
package com.yeu.pt11.demo4;

import com.yeu.pt11.demo3.Product;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>();
        set.add(new Product(2,"台灯",300));
        set.add(new Product(1,"台灯",200));
        set.add(new Product(3,"台灯",100));

        //按id进行排序
        Iterator<Product> iterator = set.iterator();
        while (iterator.hasNext()) {
            Product next = iterator.next();
            System.out.println(next);
        }
        //按售价进行排序
        Set<Product> set1 = new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice()-o2.getPrice();

            }
        });
        set.add(new Product(2,"台灯",300));
        set.add(new Product(1,"台灯",200));
        set.add(new Product(3,"台灯",100));

        //按id进行排序
        Iterator<Product> iterator = set.iterator();
        while (iterator.hasNext()) {
            Product next = iterator.next();
            System.out.println(next);
        }


    }
}
*/
