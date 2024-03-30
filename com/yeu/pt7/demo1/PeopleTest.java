package com.yeu.pt7.demo1;

public class PeopleTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "张三";
        student.age = 18;
        student.say();
        Worker worker = new Worker();
        worker.name = "李四";
        worker.age = 24;
        worker.say();
    }
}
