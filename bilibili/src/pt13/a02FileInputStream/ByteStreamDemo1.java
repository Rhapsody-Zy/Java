package bilibili.src.pt13.a02FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {

        /*
        字节输入流
            1.创建字节输入流对象
                如果文件不存在，就直接报错
            2.读取数据
                一次读一个字节，读出来的数据在ASCII上对应的数字
                读到文件末尾，read方法返回-1
            3.释放资源
        */

        FileInputStream fis = new FileInputStream("W:\\Desktop\\demo\\a.txt");
        int b1 = fis.read();
        System.out.println((char) b1);

    }
}
