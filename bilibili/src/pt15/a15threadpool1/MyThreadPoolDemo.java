package bilibili.src.pt15.a15threadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) {

        //1.创建线程池
        //无上限线程池
        ExecutorService pool1 = Executors.newCachedThreadPool();
        //有上线线程池
        ExecutorService pool2 = Executors.newFixedThreadPool(3);

        //2.提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        //3.销毁线程池
        pool1.shutdown();

    }
}
