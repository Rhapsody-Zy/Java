package bilibili.src.pt13.a04FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {

        //创建字符输入流关联本地文件
        //字符流的底层也是字节流，默认也是一个字节一个字节的读取的
        //1.如果遇到中文就会一次读取多个字节，GBK一次读两个，UTF-8一次读取三个
        //2.在读取之后，方法底层会进行解码，并转成十进制，最终将这个十进制进行返回
        FileReader fr = new FileReader("W:\\Desktop\\demo\\c.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print(ch);
            System.out.print((char) ch);
        }

        fr.close();



    }
}
