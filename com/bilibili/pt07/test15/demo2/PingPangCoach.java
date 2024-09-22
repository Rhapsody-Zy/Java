package com.bilibili.pt07.test15.demo2;

public class PingPangCoach extends Coach implements English{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("说英语");
    }
}
