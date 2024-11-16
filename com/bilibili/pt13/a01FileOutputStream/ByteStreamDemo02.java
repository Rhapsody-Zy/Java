package com.bilibili.pt13.a01FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo02 {
    public static void main(String[] args) throws IOException {

        //字节输出流写出数据的三种方式

        FileOutputStream fos = new FileOutputStream("W:\\Desktop\\demo\\a.txt");

        //写入单个字符
        //fos.write(97);

        //写入多个
        byte[] bytes = {97, 98, 99, 100, 101};

        //fos.write(bytes);

        fos.write(bytes, 1, 2);

        fos.close();

    }
}
