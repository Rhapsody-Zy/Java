package bilibili.src.pt12.a05File;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo5 {
    public static void main(String[] args) {

        //listRoots - 获取系统中所有盘符
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));

        //list - 获取当前路径下所有文件（仅能获取名字）
        File f1 = new File("W:\\Desktop\\demo");
        String[] arr2 = f1.list();
        for (String s : arr2) {
            System.out.println(s);
        }


        //File(FilenameFilter) - 利用过滤器获取内容
        String[] arr3 = f1.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
            }
        });

        System.out.println(Arrays.toString(arr3));

        //listFile - 获取当前路径下所有内容
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                System.out.println(file);
            }
        }

    }
}
