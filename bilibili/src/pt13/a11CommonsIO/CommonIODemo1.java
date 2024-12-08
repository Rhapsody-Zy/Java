package bilibili.src.pt13.a11CommonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonIODemo1 {
    public static void main(String[] args) throws IOException {

        File src = new File("W:\\Desktop\\demo\\a.txt");
        File dest = new File("W:\\Desktop\\demo\\copy1.txt");
        FileUtils.copyFile(src,dest);

    }
}
