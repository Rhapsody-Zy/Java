package com.bilibili.pt09.test01;

import java.util.ArrayList;

public class BasicSearchDemo02 {
    public static void main(String[] args) {
        //基本查找/顺序查找
        //核心：从0索引开始挨个往后查找

        int[] arr = {110,12,2,43,24,745,235,234,422,2};
        int number = 2;
        ArrayList<Integer> list = basicSearch(arr, number);
        for (int i = 0; i < list.size(); i++) {
            Integer i1 = list.get(i);
            System.out.println(i1);
        }

    }

    public static ArrayList<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                 list.add(i);
            }
        }
        return list;

    }

}
