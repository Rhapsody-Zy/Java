package com.bilibili.pt06.test05;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米", 1999);
        Phone p2 = new Phone("华为", 6999);
        Phone p3 = new Phone("苹果", 8999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> result = Judge(list);
        for (int i = 0; i < result.size(); i++) {
            Phone p = result.get(i);
            System.out.println(p.getBrand() + ", " + p.getPrice());
        }
    }

    //如果需要返回多个数据，可以把这些数据先放到一个容器当中，最后把容器进行返回
    public static ArrayList<Phone> Judge(ArrayList<Phone> list) {
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price < 3000) {
                resultList.add(p);
            }
        }
        return resultList;
    }

}
