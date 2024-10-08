package com.bilibili.pt10.test06;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo5 {
    /*
        泛型不具备继承性，但数据具备继承性
    */
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        //method里面的泛型是Ye，不具备继承性
        method(list1);
        //method(list2);
        //method(list3);

        //list中的数据具备继承性
        list1.add(new Ye());
        list1.add(new Fu());
        list1.add(new Zi());
    }

    public static void method(ArrayList<Ye> list){
    }
}
class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}
