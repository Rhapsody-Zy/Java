package bilibili.src.pt15.a12waitandnotify1;

public class Cook extends Thread{

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                //判断还能吃不
                if (Desk.count == 0) {
                    break;
                }else {
                    //判断桌子上是否有食物
                    if (Desk.foodFlag == 1) {
                        //如果有，就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //如果没有
                        System.out.println("做了一碗面条");
                        Desk.foodFlag = 1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }

    }
}
