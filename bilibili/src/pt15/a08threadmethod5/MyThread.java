package bilibili.src.pt15.a08threadmethod5;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@" + i);
            //表示出让当前cpu的执行权
            Thread.yield();
        }
    }

}
