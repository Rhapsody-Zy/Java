package bilibili.src.pt07.test02.student;

import java.util.ArrayList;

public class StudentUtil {
    public static int maxAgeStudent(ArrayList<Student> list) {
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int stuAge = list.get(i).getAge();
            if (stuAge > max) {
                max = stuAge;
            }
        }
        return max;
    }
}
