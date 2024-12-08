package bilibili.src.pt08.test10;

public class Test03 {
    public static void main(String[] args) {
        /*
           定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
         */

        System.out.println(toBinaryString(6));


    }

    public static String toBinaryString(int number) {
        //定义一个StringBuilder用来拼接对象
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (number == 0) {
                break;
            }
            //获取余数
            int remainder = number % 2;
            //倒着拼接
            sb.insert(0,remainder);

            //除以2
            number = number / 2;
        }
        return sb.toString();
    }

}
