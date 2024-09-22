package com.bilibili.pt02;


//数组
public class Demo2 {
    public static void main(String[] args) {
        //int[] array = new int[]{11,22,33};
        //int[] array = {11,22,33};

        int[] arr1 = {11,22,33};
        String[] arr2 = {"zhangsan","lisi","wangwu"};
        double[] arr3 = {1.1,2.2,3.3};
        System.out.println(arr1);   //[I@4eec7777
        System.out.println(arr2);   //[Ljava.lang.String;@3b07d329
        System.out.println(arr3);   //[D@41629346

        //数组获取
        System.out.println(arr1[2]);

        //数组遍历 - 快捷键：数组名.fori
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }


}
