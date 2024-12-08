package bilibili.src.pt13.a06BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {

        /*字符缓冲输入流
            特有方法：
                public String readLine()    读一整行
        */

        BufferedReader br = new BufferedReader(new FileReader("W:\\Desktop\\demo\\c.txt"));
        //读取数据
        //readline方法在读取时，一次读一整行，遇到回车换行结束，但他不会把回车换行符读到内存中
        /*String line = br.readLine();
        System.out.println(line);

        String line1 = br.readLine();
        System.out.println(line1);*/

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();


    }
}
