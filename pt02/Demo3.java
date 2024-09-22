package com.bilibili.pt02;

import java.util.Random;

//数组动态初始化
public class Demo3 {
    public static void main(String[] args) {
        String[] arr1 = new String[50];
        arr1[0] = "zhangsan";
        arr1[1] = "lisi";
        System.out.println(arr1[2]);    //NULL - 初始化的值

        //数组初始化规律：
        //整数类型：默认初始化值0
        //小数类型：默认初始化值0.0
        //字符类型：'/u0000' 空格
        //布尔类型：false
        //引用数据类型：null

        System.out.print("--------------------------------\n");
        //生成随机数
        int[] arr2 = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr2.length; i++) {
            int number = r.nextInt(100) + 1;
            arr2[i] = number;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("\n--------------------------------");
        //数组内容交换
        int[] arr3 = {1,2,3,4,5};
        for (int i = 0,j = arr3.length-1; i < j; i++, j--) {
            int temp = arr3[i];
            arr3[i] = arr3[j];
            arr3[j] = temp;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println("\n--------------------------------");
        //定义一个数组，存入1~5，要求打乱数组中的所有元素顺序
        int[] arr4 = {1,2,3,4,5};
        Random r1 = new Random();
        for (int i = 0; i < arr4.length; i++) {
            int randomIndex = r1.nextInt(arr4.length);
            int temp = arr4[i];
            arr4[i] = arr4[randomIndex];
            arr4[randomIndex] = temp;
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]+" ");
        }




    }
}
