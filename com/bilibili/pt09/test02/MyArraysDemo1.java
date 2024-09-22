package com.yeu.pt09.test02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("-----------toString-------------");
        //toString:将数组变成字符串
        System.out.println(Arrays.toString(arr));

        System.out.println("------------binarySearch------------");
        //binarySearch:二分法查找元素
        //细节1：二分法查找的前提：数组中的元素必须是有序的，且必须是升序的
        //细节2：如果查找的元素真实存在，则返回真实索引，如果不存在，则返回 -插入点 - 1
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,8));
        System.out.println(Arrays.binarySearch(arr,20));

        System.out.println("-----------copyOf------------");
        //copyOf:拷贝数组
        //如果新数组的长度小于被拷贝的数组，则部分拷贝，如果大于，则插入出书元素
        int[] newArr = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(newArr));

        System.out.println("-----------copyOfRange------------");
        //copyOfRange:拷贝数组（指定范围）
        //包头不包尾，包左不包右
        int[] newArr1 = Arrays.copyOfRange(arr,0,9);
        System.out.println(Arrays.toString(newArr1));

        System.out.println("-----------fill------------");
        //fill:填充数组
        Arrays.fill(arr,100);
        System.out.println(Arrays.toString(arr));

        System.out.println("------------sort-----------");
        //sort:排序。默认情况下，给基本数据类型进行升序排序，底层使用的是快速排序
        int[] arr2 = {3,2,5,1,4,7,6,8,9,5};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
