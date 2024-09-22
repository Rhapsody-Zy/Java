package com.bilibili.pt08.test01;

public class MathDemo02 {
    public static void main(String[] args) {
        //判断一个数是否为质数

        System.out.println(isPrime(13));
        System.out.println(newIsPrime(997));


    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //方法二

    public static boolean newIsPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
