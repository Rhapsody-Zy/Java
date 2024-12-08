package bilibili.src.pt12.a02Stream.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo12 {
    public static void main(String[] args) {

        //练习
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23","lisi,24","wangwu,25");

        Map<String, Integer> newMap = list.stream()
                .filter(s -> 24 <= Integer.parseInt(s.split(",")[1]))
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])
                ));

        newMap.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
