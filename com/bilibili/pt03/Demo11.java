package com.bilibili.pt03;


import java.util.Random;

//抽奖模拟 - 优化版本
public class Demo11 {
    public static void main(String[] args) {
        //1.将奖池里面的所有奖项打乱顺序
        int[] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        //2.遍历奖池
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}


