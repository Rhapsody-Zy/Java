package bilibili.src.pt13.a01FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo01 {
    public static void main(String[] args) throws IOException {

        //字节输出流 FileOutputStream
        //写出一段内容，到本地文件中
        /*
        细节：
             1.创建字节输出流对象
                参数字符串表示的路径或者File对象都是可以的
                如果文件不存在，则会自动创建一个新的文件，但是父级路径必须是存在的
                如果文件存在，则会清空文件再写入
             2.写数据
                write方法的参数是整数，但是实际上写到本地文件的是整数在ASCII码表上对应的字符
             3.释放资源
                每次使用完流之后都要释放资源
        */
        FileOutputStream fos = new FileOutputStream("W:\\Desktop\\demo\\a.txt");
        fos.write(97);
        fos.close();


    }
}
