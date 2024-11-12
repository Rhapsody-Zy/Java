package com.bilibili.pt12.a02Stream;

import com.sun.jdi.Value;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {

        //collect(Collector collector)  收集流中的数据，放到集合中(List Set Map)

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-男-15","周芷若-女-14","赵敏-女-13",
                "张强-男-20","张三丰-男-100","张翠山-男-40","张良-男-35","王二麻子-男-37","谢广坤-男-41");

        //收集到List集合中
        List<String> newList = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newList);

        //收集到Map集合中
        Map<String, Integer> newMap = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                /*
                 * toMap 参数一表示键的生成规则
                 *       参数二表示值的生成规则
                 *
                 * 参数一：
                 *       Function泛型一：表示流中每一个数据的类型
                 *               泛型二：表示Map集合中键的数据类型
                 *       方法apply形参：依次表示流里面每一个数据的类型
                 *               方法体：生成键的代码
                 *               返回值：已经生成的键
                 *
                 * 参数二：
                 *       Function泛型一：表示流中每一个数据的类型
                 *               泛型二：表示Map集合中值的数据类型
                 *       方法apply形参：依次表示流里面每一个数据的类型
                 *               方法体：生成键的代码
                 *               返回值：已经生成的值
                 * */
                .collect(Collectors.toMap(new Function<String, String>() {
                                              @Override
                                              public String apply(String s) {
                                                  return s.split("-")[0];
                                              }
                                          },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));


        Map<String, Integer> newMap2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));

        newMap.forEach((key, value) -> System.out.println(key + "=" + value));

        //System.out.println(newMap);
    }
}
