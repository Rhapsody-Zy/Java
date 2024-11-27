package com.bilibili.pt13.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test03 {
    public static void main(String[] args) throws IOException {
        //对文件中的数字进行排序

        FileReader fr = new FileReader("W:\\Desktop\\demo\\d.txt");
        StringBuilder sb = new StringBuilder();

        //读取文件中的内容，存储到sb中
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char)ch);
        }
        fr.close();

        //System.out.println(sb);

        //排序
        String[] arrStr = sb.toString().split("-");
        ArrayList<Integer> arrInt = new ArrayList<>();
        for (String s : arrStr) {
            int i = Integer.parseInt(s);
            arrInt.add(i);
        }
        Collections.sort(arrInt);
        System.out.println(arrInt);

        //写出
        FileWriter fw = new FileWriter("W:\\Desktop\\demo\\d.txt");
        for (int i = 0; i < arrInt.size(); i++) {
            if (i == arrInt.size() - 1) {
                fw.write(arrInt.get(i) + "");
            }else {
                fw.write(arrInt.get(i) + "-");
            }
        }


    }
}
