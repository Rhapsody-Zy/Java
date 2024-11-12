package com.bilibili.pt12.a02Stream.test;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo11 {
    public static void main(String[] args) {

        //练习 - 过滤奇数 保留偶数
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        list.stream().filter(s -> 0 == s % 2)
                .forEach(s -> System.out.print(s + " "));

    }
}
