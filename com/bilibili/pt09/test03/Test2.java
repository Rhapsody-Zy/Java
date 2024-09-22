package com.bilibili.pt09.test03;

import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        /*
            不死神兔 - 斐波那契数列
        */

        /*//解法1
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[11]);*/

        //解法2
        int sum = getSum(12);
        System.out.println(sum);
    }
    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        else {
            return getSum(month - 1) + getSum(month - 2);
        }
    }

}
