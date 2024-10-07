package com.bilibili.pt10.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        /*Collection 是一个接口，我们不能直接创建他的对象*/

        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        //2.清空
        //coll.clear();

        //3.删除
        //Collection里面定义的是共性方法，Set是无索引的，所以不能通过索引去删除元素，只能通过元素的对象去删除
        //方法会有一个返回值，成功则true，失败则false
        System.out.println(coll.remove("aaa"));
        System.out.println(coll);

        //4.判断元素是否包含
        //底层是依赖equals发放进行判断是否存在的
        //如果集合中存储的是自定义对象，也想通过contains来判断，那么再javabean类中，一定要重写equals方法
        boolean result = coll.contains("bbb");
        System.out.println(result);
    }
}
