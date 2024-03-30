package com.yeu.pt7.demo2;

public class Zi extends Fu{
    String s = "子类";

    public void print(){
        String s = "子类方法";
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
