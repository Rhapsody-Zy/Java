package com.bilibili.pt12.a05File.test;

import java.io.File;
import java.io.IOException;

public class FileDemo7 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("W:\\Desktop\\demo\\c.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);

    }
}
