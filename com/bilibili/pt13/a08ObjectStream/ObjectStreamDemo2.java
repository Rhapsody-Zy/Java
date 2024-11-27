package com.bilibili.pt13.a08ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("W:\\Desktop\\demo\\ObjectStream.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
