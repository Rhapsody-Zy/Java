package bilibili.src.pt15.a10threadsafe2;

public class MyRunnable implements Runnable{

    int ticket = 0;

    @Override
    public void run() {
        while (true) {
            if (method()) break;
        }
    }

    private synchronized boolean method() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (ticket == 100) {
            return true;
        }else {
            ticket ++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票!");
        }
        return false;
    }
}

