package com.bilibili.pt12.a02Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        //单列集合获取Stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f");

        //获取一条流水线，
        Stream<String> stream1 = list.stream();

    }
}
