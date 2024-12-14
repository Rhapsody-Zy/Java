package bilibili.src.pt15.a08threadmethod5;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("椿");
        t1.start();

        //插入线程 - 将t1这个线程插入到当前线程之前
        t1.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main主线程" + i);
        }

    }
}
