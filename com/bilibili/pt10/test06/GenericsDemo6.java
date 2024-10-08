package com.bilibili.pt10.test06;

import java.util.ArrayList;

public class GenericsDemo6 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
    }

    /*
        此时，泛型里面写什么类型，就能传什么类型的数据
        弊端：此时它可以接收任何类型的数据
        如果希望泛型的类型从几个固定的类型中选择时
            可以使用泛型的通配符
            ? -> 也表示不确定的类型
            他可以进行类型的限制
            ? extends E  -> 表示可以传递E或E的子类类型
            ? super E  -> 表示可以传递E或E的父类类型

        应用场景：
            1.如果我们在定义类、方法、接口的时候，如果类型不确定，就可以定义泛型类、泛型方法、泛型接口。
            2.如果类型不确定，但是能知道以后只能传递某个继承体系中的，就可以泛型的通配符
        泛型的通配符：
            关键点：可以限定类型的范围。
    */
    public static void method(ArrayList<? extends Ye> list){
    }
}


