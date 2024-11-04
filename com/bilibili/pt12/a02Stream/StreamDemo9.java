package com.bilibili.pt12.a02Stream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo9 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a","b","c","c");

        //long count()   统计
        long count = list1.stream().count();
        System.out.println(count);

        //toArray()      收集流中数据，放到数组中
        Object[] array = list1.stream().toArray();
        System.out.println(array);
    }
}
