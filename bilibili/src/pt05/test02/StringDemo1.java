package bilibili.src.pt05.test02;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.使用直接赋值的方式获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);

        //2.使用new的方式获取一个字符串对象
        //应用场景：空参构造
        String s2 = new String();
        System.out.println("@"+s2+"!");

        //3.传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //用于修改字符串
        //"abc" --> {'a','b','c'} --> {'Q','b','c'} --> "Qbc"
        char[] chs = {'a','b','c','d'};
        String s3 = new String(chs);
        System.out.println(s3);

        //4.传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //应用场景：以后在网络中传输的数据都是字节信息
        //我们一般要把字节信息进行转换，传换成字符串
        byte[] bytes = {97,98,99,100};
        String s4 = new String(bytes);
        System.out.println(s4);     //abcd



    }
}
