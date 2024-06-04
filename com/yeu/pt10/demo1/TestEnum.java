package com.yeu.pt10.demo1;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(WeekDay.Monday);
        WeekDay monday = WeekDay.Monday;
        WeekDay[] values = WeekDay.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]+" "+values[i].getDesc());
        }


    }
}
