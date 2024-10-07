package com.bilibili.pt10.test03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_ListDemo3 {
    public static void main(String[] args) {
       /*List系列集合的五种遍历方式：
            1.迭代器           在遍历时需要删除元素时
            2.列表迭代器        在遍历时需要添加元素时
            3.增强for          仅仅想遍历
            4.Lambda表达式     仅仅想遍历
            5.普通for循环       在遍历时想要操作索引
        */

        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.迭代器遍历
        /*Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }*/

        //2.增强for
        /*for (String s : list) {
            System.out.println(s);
        }*/

        //3.Lambda表达式
        //list.forEach(s -> System.out.println(s));

        //4.普通for循环
        /*for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }*/

        //5.列表迭代器
        //在普通迭代器的基础上额外添加了一个方法
        //在遍历的过程中可以添加元素
        /*ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String s = it.next();
            if ("bbb".equals(s)){
                it.add("qqq");
            }
        }
        System.out.println(list);*/

    }
}
