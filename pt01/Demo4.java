package com.bilibili.pt01;


//运算符
public class Demo4 {
    public static void main(String[] args) {
        //在代码中，如果有小数参与计算，结果有可能时不精确的
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
        System.out.println(0 % 3); //0

        //数字相加
        //数据类型不一样时
        //隐式转换：取值范围小的转换成取值范围大的
        //强制转换：取值范围大的转换成取值范围小的
        //byte -> short -> int -> long -> float -> double
        //byte short char 三种类型的数据在运算时都会先提升位int，再进行计算

        //字符串相加
        System.out.println(1+2+"abc"+1+2); //3abc12

        //字符相加
        System.out.println(1+'a');  //98
        System.out.println('a'+"abc"); //aabc

        //短路逻辑运算符
        // &&  ||
        //当左边的表达式能确定最终结果是，那么右边就不会参与运行了



    }
}
