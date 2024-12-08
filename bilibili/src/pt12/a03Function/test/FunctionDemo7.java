package bilibili.src.pt12.a03Function.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo7 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,21","周芷若,20","赵敏,22","张强,20","张三丰,24","张良,35","王二麻子,37");

        List<Student> newList = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList);
    }
}
