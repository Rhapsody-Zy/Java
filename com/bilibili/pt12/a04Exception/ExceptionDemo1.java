package com.bilibili.pt12.a04Exception;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        Student stu = new Student();
        stu.setAge(50);

        /*
        public void setAge(int age) {
        if (age < 18 || age > 40) {
            抛出异常
            throw new RuntimeException();
        }else {
            this.age = age;
        }
        }
        */

    }
}
