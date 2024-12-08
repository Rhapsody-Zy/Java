package bilibili.src.pt07.test10;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Animal a = new Dog();
        //编译看左边，执行看右边
        a.eat();
        //编译时先看左边有没有该方法，有的话再按照右边执行

        //弊端
        //当左边类中没有右边的方法，则 报错
        //a.lookHome();

        //解决方案：
        //变回子类类型就可以了
        //细节：转换的时候不能瞎转，如果转成其他类的话，就会报错
        /*Dog d = (Dog) a;
        d.lookHome();*/

        //Cat e = (Cat) a;

        /*//先判断再强转
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.lookHome();
        }else if (a instanceof Cat) {
            Cat d = (Cat) a;
            d.catchMouse();
        }else {
            System.out.println("没有这个类型，无法转换");
        }*/

        //新特性
        if (a instanceof Dog d) {
            d.lookHome();
        }else if (a instanceof Cat d) {
            d.catchMouse();
        }else {
            System.out.println("没有这个类型，无法转换");
        }
    }
}


class Animal {
    public void eat() {
        System.out.println("动物在吃东西");
    }
}

class Dog extends Animal{
    public void eat() {
        System.out.println("狗在吃狗粮");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}

class Cat extends Animal{
    public void eat() {
        System.out.println("猫在吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
