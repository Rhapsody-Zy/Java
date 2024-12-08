package bilibili.src.pt13.Test;

import java.io.*;

public class Test08 {
    public static void main(String[] args) throws IOException {

        //利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("W:\\Desktop\\demo\\e.txt")));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }
}
