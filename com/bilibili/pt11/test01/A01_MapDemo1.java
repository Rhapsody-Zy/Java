package com.bilibili.pt11.test01;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {

        //创建Map对象
        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");

        //1.添加数据
        //put方法细节
        //添加、覆盖

        //在添加数据时，如果键不存在，则直接把键和值添加到Map中  方法返回null
        //           如果键已经存在了，则覆盖原有的值，并将被覆盖的值作为返回值

        //String value = map.put("2", "4");
        //System.out.println(value);

        //2.删除数据
        map.remove("1");

        //3.clear清空

        //4.判断是否包含
        boolean result = map.containsKey("2");
        System.out.println(result);


        System.out.println(map);
    }
}
