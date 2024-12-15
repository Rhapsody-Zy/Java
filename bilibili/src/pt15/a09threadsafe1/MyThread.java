package bilibili.src.pt15.a09threadsafe1;

public class MyThread extends Thread{

    static int ticket = 0;

    //锁对象 - 一定是唯一的
    //static Object obj = new Object();
    //可以直接用类名.class

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket ++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                }else {
                    break;
                }
            }
        }
    }
}
