package bilibili.src.pt13.a12Hutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class HutoolDemo1 {
    public static void main(String[] args) {

        //可以根据传入的多个参数进行创建文件
        File file = FileUtil.file("W:\\" , "Desktop" , "demo" , "eee","hutool.txt");
        System.out.println(file);

        File touch = FileUtil.touch(file);
        System.out.println(touch);

    }
}
