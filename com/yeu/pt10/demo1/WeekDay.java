package com.yeu.pt10.demo1;

public enum WeekDay {
    Sunday("星期天"),
    Monday("星期一"),
    Tuesday("星期二"),
    Wednesday("星期三"),
    Friday("星期五");

    private String desc;

    private WeekDay(String desc) {
        this.desc = desc;
    }


    public String getDesc() {
        return desc;
    }
}
