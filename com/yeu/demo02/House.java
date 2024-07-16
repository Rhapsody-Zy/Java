package com.yeu.demo02;

public class House implements Runnable{
    private int waterAmount;
    private Object object = new Object();

    public int getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (waterAmount > 0) {
                    String name = Thread.currentThread().getName();
                    if (name.equals("狗")) {
                        System.out.println(name + "喝水");
                        waterAmount -= 1;
                    }else if (name.equals("猫")) {
                        System.out.println(name + "喝水");
                        waterAmount -= 1;
                        try {
                            Thread.sleep(20);
                        } catch (InterruptedException e) {
                        }
                    }
                    System.out.println("剩" + waterAmount);

                }else {
                    System.exit(0);
                }


            }
        }
    }
}
