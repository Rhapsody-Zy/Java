package bilibili.src.pt11.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGameOld {

    //牌盒
    static ArrayList<String> list = new ArrayList<>();

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
        list.add("大王");
        list.add("小王");
    };


    public PokerGameOld(){
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

}
