package bilibili.src.pt07.test04;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用

        //1.布偶猫
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println("---------------------------");

        //2.哈士奇
        Husky h = new Husky();
        h.eat();
        h.drink();
        h.lookHome();
        h.breakHome();
    }
}
