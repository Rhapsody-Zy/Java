package pt5.demo8;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String className;
    private List<String> students;

    // 构造函数
    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    // 添加学生
    public void addStudent(String studentName) {
        students.add(studentName);
    }

    // 获取班级名称
    public String getClassName() {
        return className;
    }

    // 获取学生列表
    public List<String> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        // 创建班级对象
        Classroom class1 = new Classroom("Class 1");

        // 向班级中添加学生
        class1.addStudent("Alice");
        class1.addStudent("Bob");
        class1.addStudent("Charlie");

        // 获取班级信息并打印
        System.out.println("Class Name: " + class1.getClassName());
        System.out.println("Students: " + class1.getStudents());
    }
}

