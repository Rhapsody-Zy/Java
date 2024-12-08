package bilibili.src.pt01;


//数据类型
public class Demo1 {
    public static void main(String[] args) {
        //byte
        byte b = 10;
        System.out.println(b);
        //short
        short s = 20;
        System.out.println(s);
        //int
        int i = 30;
        System.out.println(i);

        //long
        //如果需要定义long类型的变量，在数值的后面需要加一个L作为后缀，L可以是大写也可以是小写，但建议小写
        long n = 99999999999L;
        System.out.println(n);
        //float
        //定义float类型变量时，数据值也需要加一个F作为后缀
        float f = 10.1F;
        System.out.println(f);
        double d = 20.2;
        System.out.println(d);

        //char
        char c = '中';
        System.out.println(c);
        //true false
        boolean o = true;
        System.out.println(o);
    }
}
