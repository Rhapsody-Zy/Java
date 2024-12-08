package bilibili.src.pt11.test01;

import java.util.TreeMap;

public class A09_TreeMapDemo2 {
    //见Student2
    public static void main(String[] args) {
        TreeMap<Student2,String> tm = new TreeMap<>();

        Student2 stu1 = new Student2("zs", 20);
        Student2 stu2 = new Student2("ls", 18);
        Student2 stu3 = new Student2("ww", 19);

        tm.put(stu1,"江苏");
        tm.put(stu2,"浙江");
        tm.put(stu3,"福建");

        System.out.println(tm);
    }



}
