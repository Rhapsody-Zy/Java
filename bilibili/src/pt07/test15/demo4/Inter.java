package bilibili.src.pt07.test15.demo4;

public interface Inter {
    public default void show1() {
        System.out.println("show1方法开始执行了");
        //System.out.println("此处省略100行");
        show3();
    }

    public static void show2() {
        System.out.println("show2方法开始执行了");
        //System.out.println("此处省略100行");
        show4();
    }

    //普通的私有方法，给默认方法服务的
    private void show3() {
        System.out.println("此处省略100行");
    }

    //静态的私有方法，给静态方法服务的
    private static void show4() {
        System.out.println("此处省略100行");
    }

}
