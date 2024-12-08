package bilibili.src.pt10.test09;

public class A02_HashSetDemo1 {
    public static void main(String[] args) {

        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("zhangsan",18);

        //如果没有重写hashCode方法，那么相同属性值的不同对象的哈希值是不同的
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
