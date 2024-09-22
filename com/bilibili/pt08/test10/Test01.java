package com.bilibili.pt08.test10;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*
            键盘录入一些1~10日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        */
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum <= 200) {
            System.out.println("请输入一个数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);

            if (num < 1 || num > 100) {
                System.out.println("当前数字不在1~100之间");
            }
            //细节:
            //num是基本数据类型，添加到Integer时，出发了自动装箱
            list.add(num);

            sum += num;

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
