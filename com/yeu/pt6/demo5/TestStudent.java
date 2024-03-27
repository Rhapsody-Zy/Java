package pt6.demo5;

public class TestStudent {
    public static void main(String[] args) {
        Student[] studentArr = new Student[5];

        studentArr[0] = new Student(1, "张三", 85);
        studentArr[1] = new Student(2, "李四", 72);
        studentArr[2] = new Student(3, "王五", 90);
        studentArr[3] = new Student(4, "赵四", 78);
        studentArr[4] = new Student(5, "赵海柱", 95);

        for (int i = 0; i < studentArr.length; i++) {
            Student student = studentArr[i];
            student.showMyInfo();
        }
    }
}

