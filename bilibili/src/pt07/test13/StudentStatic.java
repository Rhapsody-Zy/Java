package bilibili.src.pt07.test13;

public class StudentStatic {
    private String name;
    private int age;

    //随着类的加载而加载，并且只执行一次
    static {
        System.out.println("静态代码块执行了");
    }


    public StudentStatic() {
        System.out.println("空参构造");
    }

    public StudentStatic(String name, int age) {
        System.out.println("有参构造");
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
