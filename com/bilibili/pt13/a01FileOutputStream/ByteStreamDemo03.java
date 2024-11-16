package com.bilibili.pt13.a01FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo03 {
    public static void main(String[] args) throws IOException {

        /*
        换行写
            再次写出一个换行符
            windows：\r\n
            Linux:\n
            Mac：\r
        续写
            续写开关：创建对象的第二个参数
            默认false
        */

        FileOutputStream fos = new FileOutputStream("W:\\Desktop\\demo\\a.txt",true);

        //写入数据
        String str = "zy";
        byte[] bytes1 = str.getBytes();
        fos.write(bytes1);

        //换行
        String wrap = "\r\n";
        byte[] bytes3 = wrap.getBytes();
        fos.write(bytes3);

        String str2 = "fx";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);

        fos.close();

    }
}
