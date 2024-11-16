package com.bilibili.pt13.a02FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {

        //文件拷贝升级版 - 异常处理 - 了解

        FileInputStream fis = new FileInputStream("W:\\Desktop\\cowboy.jpg");
        FileOutputStream fos = new FileOutputStream("W:\\Desktop\\copy.jpg");

        try(fis;fos) {
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes,0,len);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
