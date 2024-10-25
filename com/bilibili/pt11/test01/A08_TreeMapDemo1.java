package com.bilibili.pt11.test01;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class A08_TreeMapDemo1 {
    public static void main(String[] args) {
        /*
        需求1：
        键：整数表示id
        值：字符串表示商品名称
        要求：按照id的升序排列、按照id的降序排列
        */

        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
                //return o2 - o1;
            }
        });
        //添加商品
        tm.put(2,"a");
        tm.put(1,"b");
        tm.put(4,"c");
        tm.put(3,"d");

        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            int id = entry.getKey();
            String name = entry.getValue();
            System.out.println(id + " : " + name);
        }

    }
}
