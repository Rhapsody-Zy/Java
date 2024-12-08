package bilibili.src.pt07.test11;

public class Test {
    public static void main(String[] args) {

        //创建对象并调用方法

        Person p1 = new Person("老王",30);
        Dog d = new Dog(2,"黑");
        p1.keepPet(d,"骨头");

        Person p2 = new Person("老李",25);
        Cat c = new Cat(3,"白");
        p2.keepPet(c,"鱼");
    }
}
