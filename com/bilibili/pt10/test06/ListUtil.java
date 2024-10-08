package com.bilibili.pt10.test06;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {}

    //类中定义一个静态方法，用来给集合添加多个元素

    public static<E> void addAll(ArrayList<E> list, E e1,E e2,E e3,E e4){
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }


}
