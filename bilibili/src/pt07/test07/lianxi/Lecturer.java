package bilibili.src.pt07.test07.lianxi;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("讲师");
    }
}
