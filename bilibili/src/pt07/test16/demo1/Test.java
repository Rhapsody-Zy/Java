package bilibili.src.pt07.test16.demo1;

public class Test {

    public static void main(String[] args) {
        //创建对象的方式
        Car.Engine e = new Car().new Engine();

        //调用外部类编写的方法，使用内部类对象
        Car c = new Car();
        c.getEngine();
    }
}
