package com.yeu.pt7.demo3;

public class Student {
    private String name;
    private double totalScore;

    public Student(){
    }
    public Student(String name, double totalScore) {
        this.name = name;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

}
