package com.yeu.demo01;

public class Ticket implements Runnable{

    private int tickets = 50;
    private Object object = new Object();
    //
    @Override
    public void run() {
        while (true) {
            synchronized (object){
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "出售第" + tickets-- + "号票");
                }else {
                    System.exit(0);
                }
            }

            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }

        }
    }

    //
}
