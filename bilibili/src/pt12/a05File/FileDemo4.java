package bilibili.src.pt12.a05File;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {

        //获取并遍历
        File f1 = new File("W:\\Desktop\\demo");
        //
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        /*
        当调用者File表示的路径不存在时，返回null
        当调用者File表示的路径是文件时，返回null
        当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
        当调用者File表示的路径是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
        当调用者File表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
        当调用者File表示的路径是需要权限才能访问的文件夹时，返回null
        */

    }
}
