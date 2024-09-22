package com.bilibili.pt08.test07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo04 {
    public static void main(String[] args) {

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //method1(str);

        //获取正则表达式的对象
        Pattern p = Pattern.compile("(?i)(Java)\\d{0,2}");
        //获取文本匹配器的对象
        Matcher m = p.matcher(str);

        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }


    }

    private static void method1(String str) {
        //Pattern 表示正则表达式
        //Matcher 文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。
        //          在大串中去找符合匹配规则的字串

        //获取正则表达式的对象
        Pattern p = Pattern.compile("(?i)(Java)\\d{0,2}");
        //获取文本匹配器的对象
        Matcher m = p.matcher(str);
        //m 文本匹配器对象
        //str 大串
        //p 规则
        //m要在str中找符合p规则的小串


        //find方法会根据文本匹配器从头开始查找，没找到的话就返回false，找到了的话返回true，并在底层记录子串的索引
        boolean b = m.find();
        //方法底层会根据find方法记录的索引进行字符串截取
        String s1 = m.group();
        System.out.println(s1);

        //第二次调用find()时候会继续读取后面的内容，重复第一次的操作
        b = m.find();
        String s2 = m.group();
        System.out.println(s2);
    }
}
