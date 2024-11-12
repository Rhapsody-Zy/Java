package com.bilibili.pt12.a03Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {

        //引用构造方法

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,15","周芷若,14","赵敏,13","张强,20","张三丰,100","张良,35","王二麻子,37");

        /*//封装成Student对象并收集到List集合中
        List<Student> newList = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] arr = s.split(",");
                String name = arr[0];
                int age = Integer.parseInt(arr[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());

        System.out.println(newList);*/

        List<Student> newList2 = list.stream()
                .map(Student::new)
                .collect(Collectors.toList());
        System.out.println(newList2);
    }
}

