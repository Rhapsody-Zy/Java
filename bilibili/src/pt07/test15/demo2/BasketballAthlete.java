package bilibili.src.pt07.test15.demo2;

public class BasketballAthlete extends Athlete{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打篮球");
    }
}
