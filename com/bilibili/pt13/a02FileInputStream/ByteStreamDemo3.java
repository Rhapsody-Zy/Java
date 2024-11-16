package com.bilibili.pt13.a02FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {

        //文件拷贝

        FileInputStream fis = new FileInputStream("W:\\Desktop\\cowboy.jpg");
        FileOutputStream fos = new FileOutputStream("W:\\Desktop\\copy.jpg");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        //先打开的后关闭
        fos.close();
        fis.close();

    }
}
