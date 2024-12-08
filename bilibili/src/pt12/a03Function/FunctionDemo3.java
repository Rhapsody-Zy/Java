package bilibili.src.pt12.a03Function;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo3 {
    public static void main(String[] args) {

        //引用其他类的成员方法

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");

        //过滤数据
        /*list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));*/

        //方法二
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张") && s.length() == 3;
            }
        }).forEach(s -> System.out.println(s));*/

        //引用方法
        list.stream()
                .filter(new StringOperation()::stringJudge)
                .forEach(s -> System.out.println(s));
    }
}
