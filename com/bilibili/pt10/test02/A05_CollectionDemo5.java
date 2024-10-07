package com.bilibili.pt10.test02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class A05_CollectionDemo5 {
    public static void main(String[] args) {
        /*Lambda表达式遍历
            forEach
        */

        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        //利用匿名内部类的方法
        /*coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //lambda表达式
        coll.forEach(s -> System.out.println(s));
    }
}
