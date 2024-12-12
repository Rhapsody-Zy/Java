package bilibili.src.pt15.a01threadcase1;

public class ThreadDemo {
    public static void main(String[] args) {

        //多线程的第一种启动方式
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
