package com.cxl.ch6;

public class Staff {
    private String num;
    private String name;
    private double salary;

    public String getNum(){
        return num;
    }

    public void setNum(String newNum){
        this.num = newNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}


