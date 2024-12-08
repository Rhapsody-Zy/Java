package bilibili.src.pt10.test09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01_SetDemo1 {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");

        //遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String s_it = it.next();
            System.out.println(s_it);
        }

        for (String string : s) {
            System.out.println(string);
        }

        s.forEach(str -> System.out.println(str));
    }
}
