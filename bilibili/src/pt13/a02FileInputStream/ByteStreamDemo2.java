package bilibili.src.pt13.a02FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //字节流循环读取

        FileInputStream fis = new FileInputStream("W:\\Desktop\\demo\\a.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println((char) b);
        }

        fis.close();

    }
}
