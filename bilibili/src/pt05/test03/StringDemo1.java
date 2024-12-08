package bilibili.src.pt05.test03;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("Abc");


        //1.==号进行比较
        //基本数据类型：比较的是数据值
        //引用数据类型：比较的是地址值
        System.out.println(s1 == s2);   //false

        //2.比较字符串对象中内容是否完全相等
        boolean result1 = s1.equals(s2);
        System.out.println(result1);    //false

        //3.比较字符串对象中内容是否相等，忽略大小写
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);    //true



    }
}
