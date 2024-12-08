package bilibili.src.pt11.test04;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //随机点名

        Collections.addAll(list,"a1","b1","c1","d1","a2","b2","c2","d2");
        /*Random r = new Random();
        int i = r.nextInt(list.size());
        System.out.println(list.get(i));*/

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
