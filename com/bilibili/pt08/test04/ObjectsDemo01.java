package com.bilibili.pt08.test04;

import java.util.Objects;

public class ObjectsDemo01 {
    public static void main(String[] args) {

        //Objects - 是一个工具类，提供了一些方法去完成一些功能

        Student s1 = null;
        Student s2 = new Student("1","熏");

        /*if (s1 != null) {
            boolean result = s1.equals(s2);
            System.out.println(result);
        } else {
            System.out.println("调用者为空");
        }*/

        //Objects 中的 equals 会先判断是否为空
        boolean result = Objects.equals(s1, s2);
        System.out.println(result);
        //细节：
        //1.方法的底层会判断s1是否为nul1，如果为nul1，直接返回false
        //2.如果s1不为nu11，那么就利用s1再次调用equals方法
        //3.此时s1是Student类型，所以最终还是会调用Student中的equals方法。
        //  如果没有重写，比较地址值，如果重写了，就比较属性值。


        //isNull   nonNull
        Student s3 = new Student();
        Student s4 = null;
        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.isNull(s4));

        System.out.println(Objects.nonNull(s3));
        System.out.println(Objects.nonNull(s4));

    }
}
