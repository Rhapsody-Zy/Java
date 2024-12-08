package bilibili.src.pt10.test06;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {

        //不使用泛型指定数据类型时
        //默认所有的数据类型都是object类型
        //可以往集合中添加任意类型的数据
        //弊端：在我们获取数据时，不能使用他的特有行为

        ArrayList list = new ArrayList();

        list.add(123);
        list.add("abc");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            //obj.length
            System.out.println(obj);
        }
    }
}
