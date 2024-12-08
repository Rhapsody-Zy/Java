package bilibili.src.pt13.a02FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {

        //一次读取多个字节数据

        FileInputStream fis = new FileInputStream("W:\\Desktop\\demo\\a.txt");

        byte[] bytes = new byte[2];
        //一次读取多个字节数据，具体读多少，跟数组长度有关
        //返回值：本次读取到了多少个字节数据
        int len1 = fis.read(bytes);
        System.out.println(len1);

        //fis.read 会将读取到的字节放到数组中，接下来再次读取时，新字节会覆盖掉就字节数据
        //new String() - 将字节数组中的数据转换成字符串，从0开始，转换len个
        //这样就能规避掉字节数组比剩下剩下元素大的问题
        System.out.println(new String(bytes,0,len1));

        int len2 = fis.read(bytes);
        System.out.println(len2);
        System.out.println(new String(bytes,0,len2));

        int len3 = fis.read(bytes);
        System.out.println(len3);
        System.out.println(new String(bytes,0,len3));

        fis.close();

    }
}
