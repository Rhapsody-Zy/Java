package bilibili.src.pt12.a05File.test;

import java.io.File;

public class FileDemo8 {
    public static void main(String[] args) {
        File f1 = new File("W:\\Desktop\\demo");
        boolean result = getFiles(f1);
        System.out.println(result);

    }

    public static boolean getFiles(File f) {
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".py")) {
                return true;
            }
        }
        return false;
    }
}
