package bilibili.src.pt07.test12;

public class Test {
    public static void main(String[] args) {

        //final修饰的变量是引用类型时：那个变量存储的地址值不能发生改变，但对象的内部可以改变
        final Student S = new Student("熏",16);
        S.setName("椿");
        S.setAge(17);

        //S = new Student();
        System.out.println(S.getName() + ", " + S.getAge());

        //数组
        final int[] ARR = {1,2,3,4,5};
        ARR[0] = 9;

        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }
    }
}
