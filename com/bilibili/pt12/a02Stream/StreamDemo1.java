package com.bilibili.pt12.a02Stream;

import java.util.ArrayList;
import java.util.SortedMap;

public class StreamDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        list1.add("abc");
        list1.add("ab");

        //使用stream获取所有以"a"开头的，并且长度为3的元素
        list1.stream().filter(s->s.startsWith("a")).filter(s->s.length() == 3).forEach(s-> System.out.println(s));


        /*//1.将所有以"a"开头的元素存储到新的集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if (s.startsWith("a")){
                list2.add(s);
            }
        }


        //2.将所有以"a"开头的，并且长度为3的元素再存储到新集合中
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length() == 3) {
                list3.add(s);
            }
        }

        for (String s : list3) {
            System.out.println(s);
        }*/

    }
}
