package com.bilibili.pt07.test07;

public class Test {
    public static void main(String[] args) {
        //创建对象并赋值调用

        Manager m = new Manager("01","wangwu",9999,1000);
        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("02");
        c.setName("zhangsan");
        c.setSalary(8888);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}
