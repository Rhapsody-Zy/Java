package bilibili.src.pt10.test03;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
        //因为List集合是拥有索引的，所以在继承Collection的方法下，还拥有其他一些方法

        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //在集合指定的位置添加元素
        list.add(1,"zzz");

        //根据索引删除元素
        String remove = list.remove(1);
        System.out.println(remove);

        //修改指定位置的元素，返回被修改的元素
        String set = list.set(0, "yyy");
        System.out.println(set);

        //返回指定索引的元素
        String s = list.get(0);
        System.out.println(s);

        System.out.println(list);
    }
}
