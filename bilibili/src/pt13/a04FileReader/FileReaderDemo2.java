package bilibili.src.pt13.a04FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("W:\\Desktop\\demo\\c.txt");

        char[] chars = new char[2];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars,0,len));
        }

        //read(chars) - 读取数据，解码，强转三步合并了，把强转之后的字符放到数组中打印

        fr.close();
    }
}
