package com.bilibili.pt08.test08;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {

        //1.利用空参构造创建的对象，默认表示系统当前时间。
        Date d1 = new Date();
        System.out.println(d1);

        //2.利用有参构造创建的对象，表示指定的时间。
        Date d2 = new Date(0L);
        System.out.println(d2);

        //3.setTime 修改时间
        d2.setTime(1000L);
        System.out.println(d2);

        //4.getTime 获取当前时间的毫秒值
        long time = d2.getTime();
        System.out.println(time);

    }
}
