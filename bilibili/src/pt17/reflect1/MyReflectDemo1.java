package bilibili.src.pt17.reflect1;

public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {

        /*
        * 获取Class对象的三种方式
        * Class.forName("全类名")
        * 类名.class
        * 对象.getClass()
        *
        * */

        //全类名 = 包名 + 类名
        //最长使用
        Class<?> clazz1 = Class.forName("bilibili.src.pt17.reflect1.Student");
        System.out.println(clazz1);

        //作为参数传递
        Class<Student> clazz2 = Student.class;
        System.out.println(clazz2);

        //当已经有了对象时使用
        Student s = new Student();
        Class<? extends Student> clazz3 = s.getClass();
        System.out.println(clazz3);

    }
}
