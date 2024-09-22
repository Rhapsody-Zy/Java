package com.bilibili.pt06.test01;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        //add添加完后返回的是布尔值类型，无论添加什么都可以添加成功
        boolean result = list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(result);
        System.out.println(list);

        System.out.println("------------------");

        //3.删除元素
        /*boolean result1 = list.remove("aaa");
        list.remove(1);
        System.out.println(result1);
        System.out.println(list);*/

        //4.修改元素
        /*list.set(1,"ddd");
        System.out.println(list);*/


        //5.查询元素
        /*String s = list.get(0);
        System.out.println(s);*/

        //6.遍历
        //.size
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }



    }
}
