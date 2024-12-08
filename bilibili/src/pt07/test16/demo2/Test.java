package bilibili.src.pt07.test16.demo2;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
