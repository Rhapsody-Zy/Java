package bilibili.src.pt10.test09;

import java.util.TreeSet;

public class A03_TreeSetDemo1 {
    public static void main(String[] args) {

        //TreeSet对于自定义对象的排序方法
        //1、通过JavaBean重写Comparable接口的方法
        /*
        @Override
        public int compareTo(Student o) {
            return this.getAge() - o.getAge();
        }
        此时不用去重写hashCode方法，因为TreeSet底层是红黑树，不是哈希表

        */

        TreeSet<Student> s = new TreeSet<>();

        Student stu1 = new Student("zs",21);
        Student stu2 = new Student("ls",19);
        Student stu3 = new Student("ww",20);

        s.add(stu1);
        s.add(stu2);
        s.add(stu3);

        System.out.println(s);

    }
}
