package com.bilibili.pt10.test03;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo2 {
    public static void main(String[] args) {

        /*List系列集合中的两个删除的方法
        1.直接删除
        2.通过索引删除
        */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //删除元素
        //在调用方法时，如果出现了重载的情况
        //优先调用形参跟实参一致的那个方法
        list.remove(1);     //此时是删除索引为1的元素

        System.out.println(list);

        //手动装箱
        Integer i = Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);
    }
}
