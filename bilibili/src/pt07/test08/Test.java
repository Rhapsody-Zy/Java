package bilibili.src.pt07.test08;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三",18);
        Teacher t = new Teacher("建国",30);
        Administrator administrator = new Administrator("管理员",35);

        register(s);
        register(t);
        register(administrator);
    }


    //这个方法既能接收学生，也要能接收老师和管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
