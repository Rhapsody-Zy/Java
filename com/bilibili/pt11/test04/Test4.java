package com.bilibili.pt11.test04;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {

        /*
        需求
        定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。
        添加完毕后，遍历结果格式如下：
        江苏省=南京市，扬州市，苏州市，无锡市，常州市
        湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
        河北省=石家庄市，唐山市，邢台市，保定市，张家口市
        */

        //1.创建Map集合
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        ArrayList<String> city2 = new ArrayList<>();
        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city1,"南京市","扬州市","苏州市","无锡市","常州市");
        Collections.addAll(city2,"武汉市","孝感市","十堰市","宜昌市","鄂州市");
        Collections.addAll(city3,"石家庄市","唐山市","邢台市","保定市","张家口市");

        hm.put("江苏省",city1);
        hm.put("湖北省",city2);
        hm.put("河北省",city3);

        //System.out.println(hm);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",", "", "");
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + " = " + sj);
        }

        /*
        字符串拼接的两种方式
            StringJoiner
                StringJoiner sj = new StringJoiner("中间间符号", "开始符号", "结尾符号");
                可以自己设置好间隔符号和开始结尾符号，相对于StringBuilder不会造成结尾多出符号的情况
            StringBuilder
                用于较短的字符串，不需要重复拼接的情况
                挨个拼接需要的字符串
        */
    }
}
