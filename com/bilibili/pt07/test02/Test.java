package com.bilibili.pt07.test02;

public class Test {
    public static void main(String[] args) {

        //调用工具类中的静态方法
        int[] arr1 = {1,2,3,4,5};
        String arr = ArrayUtil.printArr(arr1);
        System.out.println(arr);

        double[] arr2 = {1.5,2.3,3.2,6.4,3.6};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
