package com.bilibili.pt08.test08;

import java.util.Date;
import java.util.Random;

public class DateDemo02 {
    public static void main(String[] args) {

        //extracted();

        //2.Data对象的比较
        Random r = new Random();
        Date d2 = new Date(Math.abs(r.nextInt()));
        Date d3 = new Date(Math.abs(r.nextInt()));

        long time1 = d2.getTime();
        long time2 = d3.getTime();

        if (time1 > time2) {
            System.out.println("D2 在 D3 前面");
        }else {
            System.out.println("D3 在 D2 前面");
        }

    }

    private static void extracted() {
        //1.设置距离时间原点一年的时间节点
        Date d1 = new Date(0L);
        long time = d1.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        d1.setTime(time);
        System.out.println(d1);
    }
}
