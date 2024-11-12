package com.bilibili.pt12.a03Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");

        //把集合中的元素全部编程int类型
        /*list.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(s -> System.out.println(s));*/

        //使用方法引用来操作
        list.stream()
                .map(Integer::parseInt)
                .forEach(s -> System.out.println(s));
    }
}
