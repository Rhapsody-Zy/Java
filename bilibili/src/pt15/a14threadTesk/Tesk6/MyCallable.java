package bilibili.src.pt15.a14threadTesk.Tesk6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Object call() throws Exception {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (MyCallable.class) {
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer price = list.remove(0);
                    boxList.add(price);
                    //System.out.println(getName() + "抽到了" + price + "元");
                }
            }
            Thread.sleep(10);
        }
        if (boxList.size() == 0) {
            return null;
        }else {
            return Collections.max(boxList);
        }

    }

}
