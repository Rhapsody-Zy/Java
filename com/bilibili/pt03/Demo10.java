package com.bilibili.pt03;


import java.util.Random;

//抽奖模拟
public class Demo10 {
    public static void main(String[] args) {
        //定义数组表示奖池
        int[] arr = {2,588,888,1000,10000};
        //定义新数组用于存储抽奖的结果
        int[] newArr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length;) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //获取奖项
            int price = arr[randomIndex];
            //判断当前的奖项是否存在，如果存在则重新抽取
            if (!(contains(newArr,price))){
                newArr[i] = price;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    //判断随机的奖项是否咋新数组中存在，存在则返回True,不存在返回false
    public static boolean contains(int[] arr,int price){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == price)
                return true;
        }
        return false;
    }


}


