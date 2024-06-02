package com.yeu.pt9.demo1;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "hcm";
        String s2 = "haz";

        int i = s1.compareTo(s2);
        if (i>0) {
            System.out.println("s1大于s2");
        }else if (i<0) {
            System.out.println("s1小于s2");
        }

    }
}
