package bilibili.src.pt13.a10ZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //压缩流 - 压缩单个文件

        File src = new File("W:\\Desktop\\demo\\a.txt");
        File dest = new File("W:\\Desktop\\demo");

        toZip(src,dest);

    }

    private static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        //撞见ZipEntry对象，表示压缩包里面的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("a.txt");
        //把ZipEntry对象放到压缩包中
        zos.putNextEntry(entry);
        //把src文件中的数据写到压缩包中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1 ) {
            zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();


    }



}
