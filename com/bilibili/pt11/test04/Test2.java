package com.bilibili.pt11.test04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //随机点名器
        //70%概率抽男生
        //30%概率抽女生

        int[] arr = {1,1,1,1,1,1,1,0,0,0};
        Random r = new Random();
        int i = r.nextInt(arr.length);
        int gender = arr[i];

        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        Collections.addAll(l1,"a1","b1","c1","d1");
        Collections.addAll(l2,"a2","b2","c2","d2");

        if (gender == 1) {
            Collections.shuffle(l1);
            System.out.println(l1.get(0));
        }else {
            Collections.shuffle(l2);
            System.out.println(l2.get(0));
        }
    }
}
