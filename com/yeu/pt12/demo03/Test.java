package com.yeu.pt12.demo03;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Person person = new Person(1,"张三",180,70),
                person1 = new Person(4,"李四",185,74),
                person2 = new Person(3,"王五",170,60),
                person3 = new Person(2,"赵六",175,68);

        Map<Person,String> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getHeight() - o2.getHeight();
            }
        });
        map.put(person,"zhangsan");
        map.put(person1,"lisi");
        map.put(person2,"wangwu");
        map.put(person3,"zhaoliu");

        Set<Person> people = map.keySet();
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            String s = map.get(next);
            System.out.println(next + s);
        }


        Map<Person,String> map1 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();
            }
        });
        map1.put(person,"zhangsan");
        map1.put(person1,"lisi");
        map1.put(person2,"wangwu");
        map1.put(person3,"zhaoliu");

        Set<Person> people1 = map1.keySet();
        Iterator<Person> iterator1 = people.iterator();
        while (iterator.hasNext()) {
            Person next1 = iterator1.next();
            String s = map.get(next1);
            System.out.println(next1 + s);
        }



    }
}
