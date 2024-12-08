package bilibili.src.pt12.a01immutable;

import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {

        //创建不可变的集合 - 一旦创建完成，是无法进行修改的
        List<String> list = List.of("张三", "里斯", "王五");

        System.out.println(list.get(0));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------");

        //list.remove(0);
    }
}
