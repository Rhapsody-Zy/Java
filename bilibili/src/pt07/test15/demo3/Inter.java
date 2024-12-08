package bilibili.src.pt07.test15.demo3;

public interface Inter {
    public abstract void method();


    //使用default修饰的方法 实现类中可以选择性重写接口中的该方法
    public default void show() {
        System.out.println("接口中的默认方法 --- show");
    }
}
