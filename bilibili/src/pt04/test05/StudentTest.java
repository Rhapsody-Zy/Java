package bilibili.src.pt04.test05;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //调用的空参构造
        //Student s = new Student();
        //调用有参构造
        Student s = new Student("椿",18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
