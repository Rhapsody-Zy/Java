package com.bilibili.pt12.a05File;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {

        //根据文件路径创建文件对象

        String str = "W:\\Desktop\\demo\\a.txt";

        File file = new File(str);
        System.out.println(file);

        //父级路径：W:\Desktop\demo
        //子级路径：a.txt
        String parent = "W:\\Desktop\\demo";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);
    }
}
