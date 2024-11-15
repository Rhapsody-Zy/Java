package com.bilibili.pt12.a05File.test;

import java.io.File;

public class FileDemo12 {
    public static void main(String[] args) {

        //删除一个多级文件夹

        File f1 = new File("W:\\Desktop\\demo\\bbb");

        delete(f1);
    }

    public static void delete(File f1){
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else{
                delete(file);
            }
        }
        f1.delete();
    }
}
