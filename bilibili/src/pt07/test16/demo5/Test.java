package bilibili.src.pt07.test16.demo5;

public class Test {

    public static void main(String[] args) {

        //匿名内部类
        new Swim(){
            @Override
            public void swim() {
                System.out.println("重写了swim接口");
            }
        };

        //下面这个整个new相当于一个对象 而大括号里面相当于类
        new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了eat这个抽象方法");
            }
        };

        //在测试类中调用下面的方法
        method(

                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );
    }

    //定义一个method方法
    public static void method(Animal a) {
        a.eat();
    }
}
