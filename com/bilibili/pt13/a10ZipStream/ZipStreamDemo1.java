package com.bilibili.pt13.a10ZipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //解压

        File src = new File("W:\\Desktop\\demo\\desk.zip");
        File dest = new File("W:\\Desktop\\demo");

        unzip(src,dest);

    }

    public static void unzip(File src, File dest) throws IOException {
        //解压的本质，把压缩包里面的每一个文件或者文件夹读取出来，按照层级拷贝到目的地中

        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            //System.out.println(entry);
            if (entry.isDirectory()) {
                //文件夹：需要在目的地dest处创建一个同样的文件夹
                File file = new File(dest, entry.toString());
                file.mkdirs();
            }else {
                //文件：
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                //表示在压缩包中的一个文件处理完毕了
                zip.closeEntry();
            }
        }
        zip.close();
    }

}
