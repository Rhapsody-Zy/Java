package com.bilibili.pt09.test03;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        /*定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
            要求1：属性有姓名、年龄、身高。
            要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
            （姓名中不要有中文或特殊字符，会涉及到后面的知识）*/

        GirlFriend gf1 = new GirlFriend("a",20,170.0);
        GirlFriend gf2 = new GirlFriend("b",19,168.0);
        GirlFriend gf3 = new GirlFriend("c",22,173.0);

        GirlFriend[] girlFriends = {gf1,gf2,gf3};

        /*Arrays.sort(girlFriends, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if (temp < 0) {
                    return -1;
                }else if (temp > 0) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });*/

        Arrays.sort(girlFriends, (o1,o2)->{
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if (temp < 0) {
                    return -1;
                }else if (temp > 0) {
                    return 1;
                }else {
                    return 0;
                }
            }
        );

        System.out.println(Arrays.toString(girlFriends));
    }
}


