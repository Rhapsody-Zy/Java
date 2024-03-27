package com.cxl.ch5;

public class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        if (age>0&&age<120){
            this.age = age;
        }else {
            System.out.println("异常");
        }
    }


    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0&&age<120){
            this.age = age;
        }else {
            System.out.println("异常");
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                "岁"+'}';
    }
}
