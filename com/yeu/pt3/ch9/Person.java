package com.cxl.ch9;

public class Person {
    private String name;
    private int age;
    private String num;
    private String sex;

    public Person(){
    }

    public Person(String name,int age,String num,String sex){
        this.name = name;
        this.age = age;
        this.num = num;
        this.sex = sex;
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
        this.age = age;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", num='" + num + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }


}
