package com.bilibili.pt10.test06;

import java.util.Arrays;

public class MyArrayList<E> {
    //泛型类：当一个类中，某个变量的数据类型不确定时，就可以定义带有泛型的类
    Object[] obj = new Object[10];
    int size;

    /*
    * E 表示不确定的数据类型
    * e 表示形参的名字，变量名
    */
    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
