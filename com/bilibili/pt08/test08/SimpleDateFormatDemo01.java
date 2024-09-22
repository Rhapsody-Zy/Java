package com.bilibili.pt08.test08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
    public static void main(String[] args) throws ParseException {


    }

    //SimpleDateFormat解析（字符串->日期对象）
    private static void method2() throws ParseException {
        //1.定义一个字符串表示时间
        String str = "2002-03-05 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date.getTime());
    }

    //SimpleDateFormat格式化（日期对象->字符串）
    private static void method() {
        //1.利用空参构造创建SimpleDateFormat对象，默认格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf.format(d1);
        System.out.println(str1);

        //2.利用带参构造创建SimpleDateFormat对象，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d1);
        System.out.println(str2);

        //3.yyyy年MM月dd日 HH:mm:ss  星期
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String str3 = sdf3.format(d1);
        System.out.println(str3);
    }
}
