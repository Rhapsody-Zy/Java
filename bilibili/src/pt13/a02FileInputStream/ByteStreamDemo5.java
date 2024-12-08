package bilibili.src.pt13.a02FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {

        //文件拷贝升级版
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("W:\\Desktop\\cowboy.jpg");
        FileOutputStream fos = new FileOutputStream("W:\\Desktop\\copy.jpg");

        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
}
