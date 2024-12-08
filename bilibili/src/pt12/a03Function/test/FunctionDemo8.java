package bilibili.src.pt12.a03Function.test;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionDemo8 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",21));
        list.add(new Student("lisi",22));
        list.add(new Student("wangwu",23));

        String[] arr = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
