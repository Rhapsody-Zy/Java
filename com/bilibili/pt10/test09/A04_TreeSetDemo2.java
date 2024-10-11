package com.bilibili.pt10.test09;

import java.util.Comparator;
import java.util.TreeSet;

public class A04_TreeSetDemo2 {
    public static void main(String[] args) {

        //2.比较器排序：创建TreeSet对象时，传递比较器Comparable指定规则
        //   使用原则：默认使用第一种方法，如果第一种方法不能满足需求，就使用第二种
        //          例如需要按照字符串长度进行比较

        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //先按照长度排序，长度一致的按照首字母排序
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        });

        ts.add("c");
        ts.add("ab");
        ts.add("cd");
        ts.add("efg");

        System.out.println(ts);
    }
}
