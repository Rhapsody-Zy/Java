package com.bilibili.pt13.Test;

import java.io.*;
import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) throws IOException {

        Student stu1 = new Student("JOJO",19,"南京");
        Student stu2 = new Student("Dio",1000,"上海");
        Student stu3 = new Student("吉良吉影",24,"北京");

        //在序列化对象时，一般都是将其放入一个ArrayList中
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("W:\\Desktop\\demo\\ObjectStream.txt"));
        oos.writeObject(list);


        oos.close();


    }
}
