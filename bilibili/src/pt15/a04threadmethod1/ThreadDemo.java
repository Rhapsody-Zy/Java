package bilibili.src.pt15.a04threadmethod1;

public class ThreadDemo {
    public static void main(String[] args) {

        /*
        * 细节：
        *   1、如果没有给线程设置名字，线程也会有默认名字
        *       格式：Thread-X （X为序号，从0开始）
        *   2、给线程设置名字可以使用setName方法，也可以使用构造方法
        * */

        MyThread t1 = new MyThread("椿");
        MyThread t2 = new MyThread("熏");

        t1.start();
        t2.start();
    }
}
