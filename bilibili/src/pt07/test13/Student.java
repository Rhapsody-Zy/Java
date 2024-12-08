package bilibili.src.pt07.test13;

public class Student {
    private String name;
    private int age;

    //构造代码块
    //1.写在成员位置的代码块
    //2.作用：可以把多个构造方法中重复的代码抽取出来
    //3.执行时机：我们在创建本类对象时会先执行构造代码块再执行构造方法

    {
        System.out.println("构造代码块");
    }

    public Student() {
        //System.out.println("开始创建对象");
    }

    public Student(String name, int age) {
        //System.out.println("开始创建对象");
        this.name = name;
        this.age = age;
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
}
