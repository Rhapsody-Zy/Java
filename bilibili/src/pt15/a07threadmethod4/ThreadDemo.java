package bilibili.src.pt15.a07threadmethod4;

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("椿");
        MyThread t2 = new MyThread("熏");

        t1.start();
        t2.start();
    }
}
