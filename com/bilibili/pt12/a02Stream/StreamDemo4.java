package com.bilibili.pt12.a02Stream;

import java.util.Arrays;

public class StreamDemo4 {
    public static void main(String[] args) {

        //数组创建stream流

        int[] arr = {1,2,3,4,5,6,7};

        Arrays.stream(arr).forEach(s -> System.out.println(s));


    }
}
