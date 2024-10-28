package com.bilibili.pt11.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {

    //牌盒
    static ArrayList<String> list = new ArrayList<>();
    static HashMap<String,Integer> hm = new HashMap<>();

    //静态代码块
    //特点：随着类的加载而加载，且只执行一次
    static {
        //准备牌
        //"♦","♣","♠","♥"
        //"3","4","5","6","7","8","9","10","J","Q","K","A","2"
        String[] color = {"♦","♣","♠","♥"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" 大王");
        list.add(" 小王");

        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",50);
        hm.put("大王",100);


    };


    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //遍历牌库
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i < 3) {
                lord.add(s);
                continue;
            }

            if (i % 3 == 0) {
                player1.add(s);
            }else if (i % 3 == 1) {
                player2.add(s);
            }else {
                player3.add(s);
            }
        }

        order(lord);
        order(player1);
        order(player2);
        order(player3);

        //看牌
        lookPoker("底牌", lord);
        lookPoker("player1", player1);
        lookPoker("player2", player2);
        lookPoker("player3", player3);

    }

    //name - 玩家的名字
    //list - 玩家的手牌
    public void lookPoker(String name, ArrayList<String> list) {
        System.out.print(name + " : ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }

    //利用牌的价值进行排序
    public void order(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            //Array.sort （插入排序 + 二分查找）
            @Override
            public int compare(String o1, String o2) {
                //o1:表示当前要插入到有序序列中的牌
                //o2:表示已经在有序序列中存在的牌

                //获取o1的颜色
                String color1 = o1.substring(0, 1);
                //计算o1的价值
                int value1 = getValue(o1);

                //获取o2的颜色
                String color2 = o2.substring(0, 1);
                //计算o1的价值
                int value2 = getValue(o2);

                //比较o1和o2的价值
                int i = value1 - value2;

                return i == 0 ? color1.compareTo(color2) : i;
            }
        });


    }

    //获取牌的价值
    public int getValue(String poker) {
        //截取牌的数字
        String number = poker.substring(1);
        //判断hm表中是否存在这个元素对应的价值
        if (hm.containsKey(number)) {
            //如果存在，直接获取
            return hm.get(number);
        }else {
            //如果不存在，将string类型转换成int类型，作为他的价值
            return Integer.parseInt(number);
        }

    }

}
