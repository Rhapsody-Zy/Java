package bilibili.src.pt15.a02threadcase2;

public class ThreadDemo {
    public static void main(String[] args) {

        //创建MyRun对象
        //表示多线程要执行的任务
        MyRun mr = new MyRun();

        //创建线程对象
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("线程1");
        t2.setName("线程2");

        //开启线程
        t1.start();
        t2.start();

    }
}
