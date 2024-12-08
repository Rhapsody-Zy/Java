package bilibili.src.pt13.a09PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = new PrintStream(new FileOutputStream("W:\\Desktop\\demo\\h.txt"));
        ps.println(97);     //写出 自动刷新 自动换行

        ps.print(true);

        ps.printf("%s爱上%s", "阿珍", "阿强");

        ps.close();
    }
}
