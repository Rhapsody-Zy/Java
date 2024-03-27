package com.cxl.ch5;
class TeacherTest {

    public static void main(String[] args) {
        Teacher teacher=new Teacher();
//        teacher.age=200;
//        teacher.name="张三";
        teacher.setAge(200);
        teacher.setAge(25);
        teacher.setName("张三");
        System.out.println(teacher);
    }
}