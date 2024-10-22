package com.bilibili.pt11.test01;

import java.util.*;

public class A06_HashMapDemo2 {
    public static void main(String[] args) {
        /*
        某个班级80名学生，现在需要组成秋游活动，
        班长提供了四个景点依次是（A、B、C、D），
        每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */

        //定义一个数组，存储4个景点
        String[] arr = {"A","B","C","D"};
        //利用随机数模拟80个同学的投票，并把投票的结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //如果要统计的东西较多，不方便使用计数器思想
        //我们就可以定义map集合，利用集合的键值对进行统计

        HashMap<String,Integer> hm = new HashMap<>();
        for (String name : list) {
            //先判断该景点是否已经出现在map了
            if(hm.containsKey(name)) {
                //如果已经存在了，那么获取name对应出现的次数，再自增1
                int count = hm.get(name);
                count++;
                //再把次数值覆盖到map中
                hm.put(name,count);
            }else {
                //如果没有，那么就在map中增加一对键值对
                hm.put(name,1);
            }
        }

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
