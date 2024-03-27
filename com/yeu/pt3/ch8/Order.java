package com.cxl.ch8;

public class Order {
    private String id;
    private double money;

    public Order() {
    }

    public Order(String id, double money) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
            this.money = money;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", money=" + money +
                '}';
    }
}
