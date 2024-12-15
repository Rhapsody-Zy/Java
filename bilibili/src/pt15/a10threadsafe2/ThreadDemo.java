package bilibili.src.pt15.a10threadsafe2;


public class ThreadDemo {
    public static void main(String[] args) {


        /*
        StringBuilder - 是不安全的，当程序是单线程程序时使用
        StringBuffer - 是安全的，成员方法都带有锁
        */

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.start();
        t2.start();
        t3.start();

    }
}
