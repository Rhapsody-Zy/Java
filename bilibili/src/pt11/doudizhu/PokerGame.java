package bilibili.src.pt11.doudizhu;

import java.util.*;

public class PokerGame {

    //牌盒
    static HashMap<Integer,String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    //静态代码块
    //特点：随着类的加载而加载，且只执行一次
    static {
        //准备牌
        //"♦","♣","♠","♥"
        //"3","4","5","6","7","8","9","10","J","Q","K","A","2"
        String[] color = {"♦","♣","♠","♥"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int index = 1;
        for (String n : number) {
            for (String c : color) {
                hm.put(index,c + n);
                list.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        list.add(index++);
        hm.put(index,"大王");
        list.add(index);

    }


    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌 使用TreeSet进行自动排序
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        //遍历牌库
        for (int i = 0; i < list.size(); i++) {
            Integer poker = list.get(i);
            if (i < 3) {
                lord.add(poker);
                continue;
            }
            if (i % 3 == 0) {
                player1.add(poker);
            }else if (i % 3 == 1) {
                player2.add(poker);
            }else {
                player3.add(poker);
            }
        }

        //看牌
        lookPoker("底牌", lord);
        lookPoker("player1", player1);
        lookPoker("player2", player2);
        lookPoker("player3", player3);

    }

    //name - 玩家的名字
    //list - 玩家的手牌
    public void lookPoker(String name, TreeSet<Integer> list) {
        System.out.print(name + " : ");
        for (Integer i : list) {
            String poker = hm.get(i);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}


