package bilibili.src.pt07.test01;

public class StudentTest {
    public static void main(String[] args) {

        //给老师赋值
        Student.teacherName = "王五";

        Student s1 = new Student("张三",20,"男");
        s1.study();
        s1.show();
        //s1.teacherName = "王五";

        Student s2 = new Student("李四",18,"女");
        s2.study();
        s2.show();
        //s2.teacherName = "王五";

    }
}
