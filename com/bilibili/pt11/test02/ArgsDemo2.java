package com.bilibili.pt11.test02;

public class ArgsDemo2 {
    public static void main(String[] args) {

        //可变参数
        //方法形参的个数是可以发生变化的
        //格式：属性类型...名字
        //本质上是数组

        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7));
    }
    public static int getSum(int...args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }


}
