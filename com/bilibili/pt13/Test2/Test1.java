package com.bilibili.pt13.Test2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("W:\\Desktop\\demo\\name.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            String name = s.split("-")[0];
            list.add(name);
        }
        br.close();

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
