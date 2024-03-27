package pt5.demo8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Student {
    private String studentID;
    private String name;
    private String major;

    // 构造函数
    public Student(String studentID, String name, String major) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
    }

    // 学号
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // 姓名
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 专业
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString方法，用于打印学生信息
    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    // 示例用法
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        Student[] students = new Student[]{new Student("20240001", "张三", "计算机科学与技术"),
                new Student("20240002", "李四", "计算机科学与技术"),
                new Student("20240003", "张三", "计算机科学与技术"),
                new Student("20240004", "张四", "计算机科学与技术")};
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
    }
}
