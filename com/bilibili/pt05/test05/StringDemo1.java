package com.bilibili.pt05.test05;

public class StringDemo1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        String s = arrToString(arr);
        System.out.println(s);
    }

    public static String arrToString(int[] arr){
        if (arr == null) {
            return "";
        }

        if (arr.length == 0) {
            return "[]";
        }


        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == (arr.length -1)) {
                result = result + arr[i];
            }else {
                result = result + arr[i] + ",";
            }
        }
        return result + "]";
    }
}
