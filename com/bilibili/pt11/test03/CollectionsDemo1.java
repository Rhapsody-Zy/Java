package com.bilibili.pt11.test03;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {

        //addAll方法，向集合中批量添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"abc","qwer","aswd","zxcv","123");
        System.out.println(list);

        //shuffle 打乱
        Collections.shuffle(list);
        System.out.println(list);
    }
}
