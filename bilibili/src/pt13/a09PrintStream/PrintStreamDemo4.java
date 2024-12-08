package bilibili.src.pt13.a09PrintStream;

import java.io.PrintStream;

public class PrintStreamDemo4 {
    public static void main(String[] args) {

        //System.out.println();
        //此打印流的对象在虚拟机启动的时候，由虚拟机创建，默认指向控制台
        //他是一种特殊的打印流，系统中的标准输出流，是不能关闭的，在系统中是唯一的
        PrintStream ps = System.out;
        ps.println("123");
    }
}
