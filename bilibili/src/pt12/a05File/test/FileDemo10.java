package bilibili.src.pt12.a05File.test;

import java.io.File;

public class FileDemo10 {
    public static void main(String[] args) {

        //统计文件夹的大小

        File f1 = new File("W:\\Desktop");
        long len = getLen(f1);
        System.out.println(len);

    }

    public static long getLen(File f) {
        long len = 0;
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                len += file.length();
            }else {
                len += getLen(file);
            }
        }
        return len;
    }

}
