package bilibili.src.pt06.test03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生姓名");
            s.setName(sc.next());
            System.out.println("请输入学生年龄");
            s.setAge(sc.nextInt());
            list.add(s);
        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
