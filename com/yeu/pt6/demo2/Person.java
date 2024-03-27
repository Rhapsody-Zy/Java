package pt6.demo2;

public class Person {
    private  String name ="jack";
    protected int age = 20;
    int weight;
    public int height;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
