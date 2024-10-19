package com.bilibili.pt11.test01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A05_HashMapDemo1 {
    public static void main(String[] args) {
        //创建HashMap对象
        HashMap<Student, String> hm = new HashMap<>();
        //创建学生对象
        Student stu1 = new Student("ls",18);
        Student stu2 = new Student("zs",19);
        Student stu3 = new Student("ww",20);

        hm.put(stu1, "江苏");
        hm.put(stu2, "浙江");
        hm.put(stu3, "福建");

        hm.forEach((student, s) -> {System.out.println(student + " = " + s);});

        System.out.println("---------------------");

        Set<Student> keys = hm.keySet();
        for (Student key : keys) {
            String value = hm.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("----------------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
