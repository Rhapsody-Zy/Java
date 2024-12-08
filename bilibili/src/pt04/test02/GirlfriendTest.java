package bilibili.src.pt04.test02;

public class GirlfriendTest {
    public static void main(String[] args) {
        Girlfriend gf1 = new Girlfriend();
        gf1.name = "熏";
        gf1.age = 15;
        gf1.gender = "小提琴手";

        System.out.println(gf1.name);

        gf1.sleep();

    }
}
