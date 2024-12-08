package bilibili.src.pt12.a01immutable;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {

        //创建不可变的Set集合
        //细节：当我们要获取一个不可变Set集合时，里面的参数要保证唯一性

        Set<String> set = Set.of("张三", "里斯", "王五");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
