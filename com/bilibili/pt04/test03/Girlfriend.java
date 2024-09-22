package com.bilibili.pt04.test03;

public class Girlfriend {
    private String name;
    private int age;
    private String gender;


    //针对每个私有化的成员变量，都要提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    //作用：给成员变量name进行赋值
    public void setName(String name){
        this.name = name;
    }
    //作用：对外提供name属性的
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age >= 18 && this.age <= 28){
            this.age = age;
        }else {
            System.out.println("非法参数");
        }
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
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
