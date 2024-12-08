package bilibili.src.pt07.test06.demo3;

public class ChineseDog extends Dog{

    //父类不满足要求
    //而且中华田园犬完全用不到父类中的代码，所以不需要使用super

    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
