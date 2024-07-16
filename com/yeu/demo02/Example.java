package com.yeu.demo02;

public class Example {
    public static void main(String[] args) {
        House house = new House();
        house.setWaterAmount(10);
        System.out.println("房子里有"+house.getWaterAmount() +"升水");
        Thread dog,cat;
        dog = new Thread(house);
        cat = new Thread(house);

        dog.setName("狗");
        cat.setName("猫");

        dog.start();
        cat.start();
    }
}
