package bilibili.src.pt13.a10ZipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {

        //创建File对象表示要压缩的文件夹
        File src = new File("");
        //创建File对象表示压缩包放在哪里
        File destPatent = new File("");
        //创建File对象表示压缩包的路径
        File dest = new File(destPatent,src.getName() + ".zip");
        //创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //获取src中的每个文件，变成ZipEntry对象，放到压缩包中
        toZip(src,zos,src.getName());
        zos.close();
    }

    public static void toZip(File src,ZipOutputStream zos ,String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                zos.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();

            }else {
                toZip(file,zos,name + "\\" + file.getName());
            }
        }
    }
}
