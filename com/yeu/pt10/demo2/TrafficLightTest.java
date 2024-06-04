package com.yeu.pt10.demo2;

public class TrafficLightTest {
    public static void main(String[] args) {
        TrafficLight[] values = TrafficLight.values();
        System.out.println(values[0].getColorTag());
        for (TrafficLight value : values) {
            String str = value.getColorTag();
            switch (str) {
                case  "红灯" :
                    System.out.println("禁止通行");
                    break;
                case "绿灯" :
                    System.out.println("请通行");
                    break;
                case "黄灯" :
                    System.out.println("请慎行");
                    break;
            }
        }
    }
}
