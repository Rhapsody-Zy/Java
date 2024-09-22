package com.bilibili.pt08.test05;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo01 {

    public static void main(String[] args) {

        /*
        public BigInteger(int num, Random rnd)      获取随机大整数,范围: [e~ 2的num次方-1]
        public BigInteger(String val)               获取指定的大整数
        public BigInteger(String val, int radix)    获取指定进制的大整数

        public static BigInteger valueOf(long val)  静态方法获取BigInteger的对象，内部有优化
        细节：
        对象一旦创建里面的数据不能发生改变。
        */

        //1.获取一个随机大的整数
        Random r = new Random();
        BigInteger bd1 = new BigInteger(4, r);  //0到2的4次方-1
        System.out.println(bd1);

        //2.获取一个指定大小的整数
        BigInteger bd2 = new BigInteger("9999999999999999999");
        System.out.println(bd2);

        //3.获取指定进制的大整数
        BigInteger bd3 = new BigInteger("100", 2);
        //将100看作是2进制的100
        //字符串中的数组必须和进制吻合
        System.out.println(bd3);


        //4.静态方法获取BigInteger的对象，内部有优化
        //细节
        //参数是long类型，需要在long的取值范围内
        BigInteger bd5 = BigInteger.valueOf(100);
        System.out.println(bd5);

        //  在内部对常用的数字: -16~ 16进行了优化。
        //  提前把-16 ~ 16 先创建好BigInteger的对象，如果多次获取不会重新创建新的。
        BigInteger bd6 = BigInteger.valueOf(16);
        BigInteger bd7 = BigInteger.valueOf(16);
        System.out.println(bd6 == bd7);//true
        BigInteger bd8 = BigInteger.valueOf(17);
        BigInteger bd9 = BigInteger.valueOf(17);
        System.out.println(bd8 == bd9);//false

        //5.对象一旦创建里面的数据不能发生改变
        BigInteger bd10 = BigInteger.valueOf(1);
        BigInteger bd11 = BigInteger.valueOf(2);
        BigInteger result = bd10.add(bd11);
        System.out.println(result);         //3
        System.out.println(result == bd10); //false
        System.out.println(result == bd11); //false


    }

}
