package com.bilibili.pt06.test01;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //泛型：限定集合中存储数据的类型
        //ArrayList<String> list = new ArrayList<String>();
        //JDK7:

        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);   //[]

        //上面我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
        //这个类在底层做了一些处理
        //打印的对象是集合中存储数据内容
        //在展示的时候会拿 [] 把所有的数据进行包裹

    }




}
