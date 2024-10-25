package com.bilibili.pt11.test01;

import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A10_TreeMapDemo3 {
    public static void main(String[] args) {
        /*
        需求：
        字符串“aababcabcdabcde”
        请统计字符串中每一个字符出现的次数，并按照以下格式输出输出结果：
        a (5) b (4) c (3) d (2) e (1)
        */

        String s = "aababcabcdabcde";
        //创建集合
        TreeMap<Character,Integer> tm = new TreeMap<>();

        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //比较集合中是否出现过此字符
            //是的话获取对应的value并自增一
            if (tm.containsKey(c)) {
                int count = tm.get(c);
                count++;
                tm.put(c,count);
            }else {
                //没有出现过的话就添加字符，value默认为1
                tm.put(c,1);
            }
        }

        //遍历集合 并 拼接
        /*Set<Map.Entry<Character, Integer>> entries = tm.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character c = entry.getKey();
            Integer count = entry.getValue();
            System.out.print(c + " (" + count + ") ");
        }*/

        /*StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);*/

        StringJoiner sj = new StringJoiner("","","");
        tm.forEach((key, value) -> sj.add(key + "").add("(").add(value + "").add(")"));
        System.out.println(sj);

    }
}
