package com.bilibili.pt10.test02;

import java.util.ArrayList;
import java.util.Collection;

public class A04_CollectionDemo4 {
    public static void main(String[] args) {
        /*增强for遍历
            底层就是迭代器，为了简化迭代器的代码书写
            所有的单列集合和数组才能使用增强for遍历
         */

        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        //s 就是一个第三方变量，在循环的过程中依次表示集合中的每个数据
        //可以直接使用 coll.for 进行快捷书写
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
