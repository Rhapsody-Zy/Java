package bilibili.src.pt06.test04;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User s1 = new User("01","椿","123");
        User s2 = new User("02","熏","456");
        User s3 = new User("03","麻衣","789");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(Find(list,"02"));

    }

    public static int getIndex(ArrayList<User> list, String sid){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            boolean result = user.getId().equals(sid);
            if (result) {
                return i;
            }
        }
        return -1;
    }

    public static boolean Find(ArrayList<User> list, String sid) {
        return getIndex(list,sid) >= 0;
    }
}
