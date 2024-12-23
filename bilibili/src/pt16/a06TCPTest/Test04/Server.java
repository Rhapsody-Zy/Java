package bilibili.src.pt16.a06TCPTest.Test04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.*;

public class Server {
    public static void main(String[] args) throws IOException {

        //创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,      //核心线程数量
                16,                 //线程池大小
                60,                 //空闲时间
                TimeUnit.SECONDS,       //空闲时间（单位）
                new ArrayBlockingQueue<>(2),    //队列
                Executors.defaultThreadFactory(),       //线程工厂，让线程如何创建线程对象
                new ThreadPoolExecutor.AbortPolicy()    //阻塞队列
        );

        ServerSocket ss = new ServerSocket(10000);
        while (true) {
            Socket socket = ss.accept();
            //new Thread(new MyRunnable(socket)).start();
            pool.submit(new MyRunnable(socket));

        }


    }
}
