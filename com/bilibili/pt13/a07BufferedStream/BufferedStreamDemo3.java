package com.bilibili.pt13.a07BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {

        //字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("W:\\Desktop\\demo\\e.txt"));
        bw.write("你浅浅的微笑，");

        bw.newLine();

        bw.write("就像鸡你太美");

        bw.close();

    }
}
