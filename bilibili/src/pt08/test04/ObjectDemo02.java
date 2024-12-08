package bilibili.src.pt08.test04;

public class ObjectDemo02 {
    public static void main(String[] args) {

        //2.equals - 比较两个对象是否相等

        //默认比较的是地址值，也可以用过重写equals的方法进行比较属性值

        Student stu1 = new Student("1","椿");
        Student stu2 = new Student("1","椿");

        boolean equals = stu1.equals(stu2);
        System.out.println(equals);

    }
}
