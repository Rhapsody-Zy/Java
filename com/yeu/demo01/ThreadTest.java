package com.yeu.demo01;

public class ThreadTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t2 = new Thread(ticket);

        Thread t0 = new Thread(ticket);
        Thread t1 = new Thread(ticket);

        t0.setName("第一个窗口");
        t1.setName("第二个窗口");
        t2.setName("第三个窗口");

        t0.start();
        t1.start();
        t2.start();

    }


}
