package pt6.demo5;

public class Student {
    private int number;
    private String name;
    private int score;

    public Student(int number, String name, int score) {
        this.number = number;
        this.name = name;
        this.score = score;
    }

    public void showMyInfo() {
        System.out.println("Student Number: " + number);
        System.out.println("Student Name: " + name);
        System.out.println("Student Score: " + score);
        System.out.println();
    }
}
