package com.bilibili.pt08.test01;

public class MathDemo01 {
    public static void main(String[] args) {

        //Math.abs - 获取参数的绝对值
        System.out.println(Math.abs(88));   //88
        System.out.println(Math.abs(-88));  //-88
        //bug - 取值范围为： -2147483648 ~ 2147483648
        //-2147483648 没有正数与之对应，abs结果产生bug
        System.out.println(Math.abs(-2147483648));  //-2147483648
        //解决方法
        //System.out.println(Math.absExact(-2147483648));

        //Math.ceil - 向上取整

        //Math.floor - 去尾，向下取整

        //Math.round - 四舍五入

        //Math.pow(a,b) - 获取a的b次幂
        System.out.println(Math.pow(2, 3)); //8
        //细节
        //当第二个参数是0~1之间的小数时
        System.out.println(Math.pow(4, 0.5));   //2.0
        //当第二个参数是负数时
        System.out.println(Math.pow(2, -2));    //2 的 -2 次方  0.25
        //第二个参数一般传递大于等于1的正整数

        //Math.sqrt - 开平方

        //Math.cbrt - 开立方

        //Math.random() - 获取 [0,1) 的随机数


    }
}
