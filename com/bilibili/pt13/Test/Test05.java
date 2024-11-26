package com.bilibili.pt13.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test05 {
    public static void main(String[] args) throws IOException {

        //对文档中的内容 按行进行排序

        //读数据
        BufferedReader br = new BufferedReader(new FileReader("W:\\Desktop\\demo\\csb.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        //排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1 = Integer.parseInt(o1.split("\\.")[0]);
                int i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1 - i2;
            }
        });

        //System.out.println(list);
        //写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("W:\\Desktop\\demo\\csbCopy.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();

    }
}
