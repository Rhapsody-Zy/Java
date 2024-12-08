package bilibili.src.pt07.test15.demo2;

public class PingPangAthlete extends Athlete implements English{
    public PingPangAthlete() {
    }

    public PingPangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("说英语");
    }
}
