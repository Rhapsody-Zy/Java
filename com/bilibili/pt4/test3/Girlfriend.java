package com.bilibili.pt4.test3;

public class Girlfriend {
    private String name;
    private int age;
    private String gender;


    //针对每个私有化的成员变量，都要提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    //作用：给成员变量name进行赋值
    public void setName(String n){
        name = n;
    }
    //作用：对外提供name属性的
    public String getName(){
        return name;
    }

    public void setAge(int a){
        if(a >= 18 && age <= 28){
            age = a;
        }else {
            System.out.println("非法参数");
        }
    }

    public int getAge(){
        return age;
    }

    public void setGender(String g){
        gender = g;
    }

    public String getGender(){
        return gender;
    }




    public void sleep(){
        System.out.println("女朋友在睡觉");
    }

    public void eat(){
        System.out.println("女朋友在吃饭");
    }
}
