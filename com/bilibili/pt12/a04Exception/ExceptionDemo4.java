package com.bilibili.pt12.a04Exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {

        //异常中常见的三种方法

        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //String message = e.getMessage();
            //System.out.println(message);

            //String str = e.toString();
            //System.out.println(str);

            e.printStackTrace();
        }


        System.out.println("继续执行");

    }
}
