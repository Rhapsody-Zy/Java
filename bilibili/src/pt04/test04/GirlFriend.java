package bilibili.src.pt04.test04;

public class GirlFriend {
    private int age;

    public void method(){
        int age = 10;
        System.out.println(age);//10 谁离我近，我就用谁
        System.out.println(this.age);//0 加上this就会直接调用成员变量
    }
}

