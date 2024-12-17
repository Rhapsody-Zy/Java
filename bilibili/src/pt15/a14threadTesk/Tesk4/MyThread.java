package bilibili.src.pt15.a14threadTesk.Tesk4;

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
                }else if (count > 1){
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIX;
                    price = r.nextDouble(bounds);
                    if (price < MIX) {
                        price = MIX;
                    }
                }
                money -= price;
                count--;
                System.out.println(Thread.currentThread().getName() + "抢到了" + price + "元");
            }
        }
    }
}
