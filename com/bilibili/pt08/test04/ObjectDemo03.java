package com.bilibili.pt08.test04;

public class ObjectDemo03 {
    public static void main(String[] args) throws CloneNotSupportedException {

        //3.对象的克隆

        //创建一个对象
        User u1 = new User(1,"熏","123qwe");

        //克隆对象
        //Object u2 = u1.clone();
        User u2 = (User) u1.clone();

        System.out.println(u1); 
        System.out.println(u2);

    }
}
