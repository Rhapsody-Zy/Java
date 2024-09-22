package com.yeu.pt09.test03;

public class LambdaDemo1 {
    public static void main(String[] args) {
        /*Lambda表达式的注意点：
            1.Lambda表达式可以用来简化匿名内部类的书写
            2.Lambda表达式只能简化函数式接口的匿名内部类的写法
            3.函数式接口：
                有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
        */

    }

    public static void method(Swim s){
        s.swimming();
    }
}


interface Swim{
    public abstract void swimming();
}
