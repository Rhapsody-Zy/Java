package com.bilibili.pt08.test04;

public class ObjectDemo03 {
    public static void main(String[] args) throws CloneNotSupportedException {

        //3.对象的克隆

        //创建一个对象
        User u1 = new User(1,"熏","123qwe");

        //克隆对象

        //细节：
        //方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去。
        //书写细节：
        //1.重写Object中的clone方法
        //2.让javabean类实现Cloneable接口
        //3.创建原对象并调用clone就可以了。

        //Object u2 = u1.clone();
        User u2 = (User) u1.clone();

        System.out.println(u1); 
        System.out.println(u2);


        //浅克隆：不管对象内部的属性是基本数据类型还是引用数据类型，都完全拷贝过来
        //深克隆：
            //基本数据类型拷贝过来
            //字符串复用
            //引用数据类型会重新创建新的
    }
}
