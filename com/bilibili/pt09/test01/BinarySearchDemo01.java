package com.bilibili.pt09.test01;

public class BinarySearchDemo01 {
    public static void main(String[] args) {
        //二分查找
        //核心：每次排除一半的查找范围
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int number = 8;
        int result = binarySearch(arr, number);
        System.out.println(result);


    }

    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            int mid = (min + max) / 2;
            if (min > max) {
                return -1;
            }
            if (arr[mid] == number) {
                return mid;
            }else if (arr[mid] > number) {
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        ///////

    }
}
