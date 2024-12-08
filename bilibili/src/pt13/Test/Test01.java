package bilibili.src.pt13.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {

        //拷贝一个文件夹，需要考虑子文件夹

        File f1 = new File("W:\\Desktop\\demo\\aaa");
        File f2 = new File("W:\\Desktop\\demo\\dest");

        copyDir(f1, f2);


    }

    private static void copyDir(File f1, File f2) throws IOException {
        //先创建一个存放拷贝文件的地方，如果这个文件存在，则创建失败
        f2.mkdirs();
        //遍历文件夹中的内容
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                //判断文件，拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(f2,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                if ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            } else {
                //判断文件夹，递归
                copyDir(file,new File(f2,file.getName()));
            }
        }

    }


}
