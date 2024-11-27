package com.bilibili.pt13.a06BufferedStream;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //利用字节缓冲流拷贝文件

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("W:\\Desktop\\demo\\cowboy.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("W:\\Desktop\\demo\\copy.jpg"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();

    }
}
