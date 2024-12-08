package bilibili.src.pt07.test01;

public class Student {
    private String name;
    private int age;
    private String gender;

    //新增一个老师，这个老师是一个共享老师
    public static String teacherName;

    //static 表示静态，是java中的一个修饰符，可以修饰成员变量，成员方法
    //被static修饰的成员变量，叫做静态变量
        //特点：被该类的所有对象共享
        //可以使用类名（推荐）或对象名调用 - 静态的东西是不属于对象的，是属于类的
    //被static修饰的成员方法，叫做静态方法


    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //行为
    public void study() {
        System.out.println(name + "正在学习");
    }

    public void show() {
        System.out.println(name + ", " + age + ", " + gender + ", " + teacherName);
    }

}
