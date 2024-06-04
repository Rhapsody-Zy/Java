package com.yeu.pt11.demo5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(1,"zhangsan",18,190,80),
                p2 = new Person(2,"lisi",19,185,75),
                p3 = new Person(3,"wangwu",17,175,65);

        Set<Person> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge()-p2.getAge();
            }
        });

        set.add(p1);
        set.add(p2);
        set.add(p3);

        for (Person person : set) {
            System.out.println(person);
        }

        Set<Person> set1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) (o1.getHeight()-o2.getHeight());
            }
        });

        set1.add(p1);
        set1.add(p2);
        set1.add(p3);

        for (Person person : set1) {
            System.out.println(person);
        }
    }
}
