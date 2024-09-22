package com.bilibili.pt07.test14.demo1;

import com.bilibili.pt07.test14.demo1.Person;

public class Student extends Person {

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学生上学");
    }
}
