package com.bilibili.pt12.a02Stream.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo13 {
    public static void main(String[] args) {

        //练习
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1,"张小三,20","李小四,21","王小五,22");
        Collections.addAll(list2,"杨小三,20","杨小四,21","杨小五,22");

        //男演员只要名字为3个字的前两人
        Stream<String> stream1 = list1.stream()
                .filter(s -> s.split(",")[0].length() == 3).limit(2);
        //女演员只要姓杨的，并且不要第一个
        Stream<String> stream2 = list2.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);
        //把过滤后的合并在一起

        //String -> Actor对象(类型转换)
        /*Stream.concat(stream1,stream2).map( s -> {
            String name = s.split(",")[0];
            int age = Integer.parseInt(s.split(",")[1]);
            return new Actor(name,age);
        });*/

        List<Actor> newList = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}
