package com.yeu.pt10.demo2;

public enum TrafficLight {
    RED("红灯"),
    GREEN("绿灯"),
    YELLOW("黄灯");

    private String colorTag;

    TrafficLight(String colorTag) {
        this.colorTag = colorTag;
    }

    public String getColorTag() {
        return colorTag;
    }
}
