package bilibili.src.pt13.a08ObjectStream;

import java.io.Serial;
import java.io.Serializable;

//Serializable接口里面没有抽象接口，属于标记型接口
//一旦实现这个接口，那么就表示当前类可以被序列化 - 相当于许可证

public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 1679307809050560938L;


    private String name;
    private int age;
    //设置不被序列化，即不保存在文件中 - 瞬态关键字
    //private transient String address;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
