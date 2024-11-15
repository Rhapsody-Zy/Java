package com.bilibili.pt12.a05File.test;

import java.io.File;

public class FileDemo9 {
    public static void main(String[] args) {
        String str = "W:\\Desktop";
        File f1 = new File(str);
        findFiles(f1);

    }

    public static void findFiles(File f1) {
        File[] files = f1.listFiles();
        for (File file : files) {
            String name = file.getName();
            if (name.endsWith(".txt")) {
                System.out.println(file);
            }
            if (file.isDirectory()) {
                findFiles(file);
            }
        }
    }
}
