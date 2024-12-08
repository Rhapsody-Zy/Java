package bilibili.src.pt07.test06.demo4;

public class Student extends Person{

    //子类不能继承父类的方法，但能通过super调用
    //子类构造方法的第一行，有一个默认的super()
    

    public Student() {
        //子类的构造方法中隐藏的super()去访问父类的无参构造

        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
