package bilibili.src.pt13.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {

        //文件加密 - 利用二进制的 ^

        //创建对象关联原始文件
        FileInputStream fis = new FileInputStream("W:\\Desktop\\demo\\cowboy.jpg");
        FileOutputStream fos = new FileOutputStream("W:\\Desktop\\demo\\ency.jpg");

        //加密处理
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b ^ 2);
        }

        fos.close();
        fis.close();
    }
}
