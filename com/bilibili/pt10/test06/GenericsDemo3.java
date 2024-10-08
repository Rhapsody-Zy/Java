package com.bilibili.pt10.test06;

import java.util.ArrayList;

public class GenericsDemo3 {
    /*
    泛型方法 -> 方法中的形参类型不确定时
        1.在类名后面定义泛型
        2.在方法名的修饰符后定义泛型
    */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list,"aaa","bbb","ccc","ddd");
        System.out.println(list);
    }
}
