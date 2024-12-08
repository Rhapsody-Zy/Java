package bilibili.src.pt12.a05File;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {

        //判断操作
        File f1 = new File("W:\\Desktop\\demo\\a.txt");
        //判断是否是一个文件夹路径
        System.out.println(f1.isDirectory());
        //判断是否是一个文件路径
        System.out.println(f1.isFile());
        //判断文件是否存在
        System.out.println(f1.exists());

        System.out.println("--------------------");

        //length - 返回文件大小
        //细节：这个方法只能获取文件的大小，不能获取文件夹的大小
        //单位是字节
        long l1 = f1.length();
        System.out.println(l1);

        //getAbsolutePath - 获取文件的绝对路径
        String path1 = f1.getAbsolutePath();
        System.out.println(path1);

        //getName - 获取名字
        //细节：调用者是文件时，返回文件名加后缀名，是文件的话就没有后缀名
        String name = f1.getName();
        System.out.println(name);

        //lastModified - 获取时间的毫秒值，变成字符串
        long time = f1.lastModified();
        System.out.println(time);
        String currenTime = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(time);
        System.out.println(currenTime);

    }
}
