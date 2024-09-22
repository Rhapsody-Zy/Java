package com.bilibili.pt08.test10;

public class A04_IntegerDemo4 {
    public static void main(String[] args) {
        /*
            public static string tobinarystring(int i) 得到二进制
            public static string tooctalstring(int i) 得到八进制
            public static string toHexstring(int i) 得到十六进制
            public static int parseInt(string s) 将字符串类型的整数转成int类型的整数
        */

        //1.把整数转成二进制，十六进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);

        //2.把整数转成八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);

        //3.把整数转成十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);

        //4.把字符串类型的整数转成int类型的整数
        //强类型语言：每种数据在Java中都有各自的数据类型
        //在计算时，如果不是同一种数据类型，无法直接计算
        int i = Integer.parseInt("123");
        System.out.println(i);

        //8中包装类中，除了Character都有对应的parseXxx的方法，进行类型转换
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);

    }
}
