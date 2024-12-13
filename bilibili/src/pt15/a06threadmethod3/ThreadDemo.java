package bilibili.src.pt15.a06threadmethod3;

public class ThreadDemo {
    public static void main(String[] args) {

        //守护线程
        //细节：当其他的非守护线程执行完毕之后，守护线程会陆续结束
        //      当女神线程运行完后，备胎线程就没必要存在了

        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t1.setName("美羊羊");
        t2.setName("沸羊羊");

        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}
