package bilibili.src.pt15.a16threadpool2;

import java.util.concurrent.*;

public class MyThreadPoolDemo1 {
    public static void main(String[] args) {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,  //核心线程数量，不能小于0
                6,  //最大线程树，不能小于0，最大数量>=核心线程数量
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        //pool.submit();

    }
}
