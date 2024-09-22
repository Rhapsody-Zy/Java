package com.bilibili.pt05.test11;

import java.util.StringJoiner;

public class StringJoinerDemo1 {

    /*public StringJoiner（间隔符号）
    public StringJoiner（间隔符号，开始符号，结束符号）


    public StringJoiner add（添加的内容）
    添加数据，并返回对象本身

    public int length()
    返回长度（字符出现的个数）

    public String toString()
    返回一个字符串（该字符串就是拼接之后的结果）*/

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
    }
}
