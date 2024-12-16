package bilibili.src.pt15.a14Tesk.Tesk4;

import java.text.BreakIterator;
import java.util.Random;

public class MyThread extends Thread{
    static int count = 3;
    static double money = 100;

    static final double MIX = 0.01;

    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (count == 0) {
                System.out.println(Thread.currentThread().getName() + "没抢到红包");
            }else {
                //定义一个变量，表示中奖金额
                double price = 0;
                if (count == 1) {
                    price = money;
                    System.out.println(Thread.currentThread().getName() + "抢到了" + price + "元");
                }else if (count > 1){
                    Random r = new Random();
                    price = r.nextDouble(money);
                    money -= price;
                    System.out.println(Thread.currentThread().getName() + "抢到了" + price + "元");
                    count--;
                }else {
                    System.out.println(Thread.currentThread().getName() + "没抢到了");
                }
            }
        }


    }
}
