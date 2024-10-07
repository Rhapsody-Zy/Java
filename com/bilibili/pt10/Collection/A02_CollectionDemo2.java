package com.bilibili.pt10.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();

        Student stu1 = new Student("zs",18);
        Student stu2 = new Student("ls",19);
        Student stu3 = new Student("ww",20);

        coll.add(stu1);
        coll.add(stu2);
        coll.add(stu3);

        //判断集合中某一个学生对象是否存在
        Student stu4 = new Student("zs",18);
        //在javabean类中重写equals的方法
        System.out.println(coll.contains(stu4));
    }
}
