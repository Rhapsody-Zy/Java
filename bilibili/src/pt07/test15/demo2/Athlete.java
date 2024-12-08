package bilibili.src.pt07.test15.demo2;

public abstract class Athlete extends Person{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
