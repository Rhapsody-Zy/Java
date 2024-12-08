package bilibili.src.pt11.test04;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        /*班级里有N个学生
        要求：
        被点到的学生不会再被点到。
        但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。*/

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a1","b1","c1","d1","a2","b2","c2","d2");
        //创建一个临时的集合，用来存已经被点到的学生的名字
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.println("------------第" + i + "轮点名-----------");
            int size = list1.size();
            for (int j = 0; j < size; j++) {
                Collections.shuffle(list1);
                list2.add(list1.get(0));
                System.out.println(list1.remove(0));
            }
            list1.addAll(list2);
            list2.clear();
        }
    }
}
