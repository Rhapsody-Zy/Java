package bilibili.src.pt15.a14threadTesk.Tesk6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,200,500,300,800,600);

        MyCallable mc = new MyCallable(list);
        FutureTask<Integer> ft1 = new FutureTask<Integer>(mc);
        FutureTask<Integer> ft2 = new FutureTask<Integer>(mc);

        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();

        Integer result1 = ft1.get();
        Integer result2 = ft2.get();
        if(result1 > result2) {
            System.out.println("最大的奖项来自抽奖箱1，为 " + result1 + " 元");
        }else {
            System.out.println("最大的奖项来自抽奖箱2，为 " + result2 + " 元");
        }
    }
}
