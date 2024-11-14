package com.bilibili.pt12.a05File;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {

        //创建文件
        //如果文件不存在，返回true，存在 返回false
        File f1 = new File("W:\\Desktop\\demo\\b.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);

        //创建文件夹
        File f2 = new File("W:\\Desktop\\demo\\aaa");
        boolean b2 = f2.mkdir();
        System.out.println(b2);

        //创建多级文件夹
        File f3 = new File("W:\\Desktop\\demo\\aaa\\bbb\\ccc");
        boolean b3 = f3.mkdir();
        System.out.println(b3);

        //删除文件，空文件夹
        //细节：删除的是文件，直接删除，不走回收站
        //      删除的是空文件夹，直接删除，不走回收站
        //      删除的有内容文件夹，删除失败
        File f4 = new File("W:\\Desktop\\demo\\b.txt");
        boolean delete = f4.delete();
        System.out.println(delete);
    }
}
