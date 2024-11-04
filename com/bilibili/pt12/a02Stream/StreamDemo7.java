package com.bilibili.pt12.a02Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {

        //Stream的方法

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a","b","c","c");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"d","e","f");


        //distinct - 去重
        list1.stream().distinct().forEach(s -> System.out.println(s));

        //concat - 合并a和b两个流
        Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s));

    }
}
