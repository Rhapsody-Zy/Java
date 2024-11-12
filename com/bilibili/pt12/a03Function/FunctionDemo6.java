package com.bilibili.pt12.a03Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo6 {
    public static void main(String[] args) {

        //引用数组的构造方法

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);

        Integer[] arr2 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr2));
    }
}
