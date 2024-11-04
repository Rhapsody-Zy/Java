package com.bilibili.pt12.a02Stream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {

        //一堆零散数据调用stream流

        Stream.of(1,2,3,4,5).forEach(s -> System.out.print(s));

        Stream.of("a","b","c").forEach(s -> System.out.print(s));


        //注意
        //方法的形参是一个可变参数，可以传递一堆零散数据，也可以传递数组
        //但是数组必须是引用数据类型的，如果传递基本数据类型，会把整个数组当作一个元素，放到stream流中
        int[] arr = {1,2,3,4,5,6,7};
        Stream.of(arr).forEach(s -> System.out.print(s));
    }
}
