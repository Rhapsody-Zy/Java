package com.bilibili.pt05.test13;

public class Test2 {
    public static void main(String[] args) {
        String num1 = "12345";
        String num2 = "10";

        int number1 = changInt(num1);

        int number2 = changInt(num2);

        String result = number1 * number2 + "";
        System.out.println(result);
    }

    public static int changInt(String num) {
        int result = 0;
        char[] arr = num.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i] - 48;
            result = result * 10 + number;
        }
        return result;
    }
}
