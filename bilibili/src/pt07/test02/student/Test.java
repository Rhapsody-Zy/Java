package bilibili.src.pt07.test02.student;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("椿",16,"女");
        Student stu2 = new Student("熏",19,"女");
        Student stu3 = new Student("有马",17,"男");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAgeStudent = StudentUtil.maxAgeStudent(list);

        System.out.println(maxAgeStudent);
    }
}
