package bilibili.src.pt15.a05threadmethod2;

public class ThreadDemo {
    public static void main(String[] args) {

        /*线程的优先级
        *   默认优先级为5，优先级越大，抢占的机会越大
        *
        * */

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr,"熏");
        Thread t2 = new Thread(mr,"椿");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();

    }
}
