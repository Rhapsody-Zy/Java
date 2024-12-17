package bilibili.src.pt15.a14threadTesk.Tesk5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{

    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    System.out.println(getName() + boxList);
                    Integer max = getMax(boxList);
                    System.out.println("最大奖项为" + max);
                    break;
                }else {
                    Collections.shuffle(list);
                    Integer price = list.remove(0);
                    boxList.add(price);
                    //System.out.println(getName() + "抽到了" + price + "元");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Integer getMax(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer i1 = list.get(i);
            if (i1 > max) {
                max = i1;
            }
        }
        return max;
    }

}
