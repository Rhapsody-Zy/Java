package com.bilibili.pt10.test02;

import com.bilibili.pt07.test16.demo3.Outer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {
        //迭代器遍历
        //迭代器遍历完后，指针不会复位
        //循环中只能使用一次next()方法
        //迭代器遍历时，不能使用集合的方法进行增加或删除
        //   必要删除的话，需要使用迭代器的remove方法
        /*
        迭代器在Java中的类是Iterator，迭代器是 集合专用 的遍历方式
        boolean hasNext() 判断当前位置是否有元素
        E next() 获取当前位置的元素，并将迭代器对象移向下一位置*/

        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        //当结束上面的遍历后，迭代器指针已经指向了最后没有元素的位置了
        //System.out.println(it.next());//NoSuchElementException

        //指针不会复位
        System.out.println(it.hasNext());   //false

        //如果需要进行第二次遍历，则需要再次获取一个迭代器对象
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()){
            String str = it2.next();
            System.out.println(str);
        }
    }
}
