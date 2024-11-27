package com.bilibili.pt13.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test09_2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("W:\\Desktop\\demo\\ObjectStream.txt"));
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }

        ois.close();
    }
}
