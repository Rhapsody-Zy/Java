package bilibili.src.pt15.a14Tesk.Tesk1;

public class Ticket extends Thread {

    static int count = 1000;

    @Override
    public void run() {
        while (true) {
            synchronized (Ticket.class) {
                if (count == 0) {
                    break;
                }else {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "正在打印票，还剩" + count + "张票");
                }
            }
        }


    }
}
