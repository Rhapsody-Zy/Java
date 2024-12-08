package bilibili.src.pt07.test16.demo3;

public class Test {
    public static void main(String[] args) {
        //静态内部类也是成员内部类的一种
        //静态内部类只能访问外部类中的静态方法和静态变量
        //如果想要访问非静态的需要创建外部类的对象

        //创建静态内部类的对象
        //只要是静态的东西，都可以用类名.直接获取

        Outer.Inner oi = new Outer.Inner();
        oi.show1();
        //调用内部类的静态方法
        Outer.Inner.show2();
    }
}
