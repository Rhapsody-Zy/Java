package com.bilibili.pt12.a05File;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class FileDemo6 {
    public static void main(String[] args) {

        File f1 = new File("W:\\Desktop\\demo");

        //listFile - 获取当前路径下所有内容
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file);
            }
        }

        //listFile(FileFilter)
        File[] arr = f1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });

        System.out.println(Arrays.toString(arr));

    }
}
