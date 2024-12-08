package bilibili.src.pt13.Test;

import java.io.*;

public class Test07 {
    public static void main(String[] args) throws IOException {

        //测试软件的运行次数

        BufferedReader br = new BufferedReader(new FileReader("W:\\Desktop\\demo\\count.txt"));
        String line = br.readLine();
        br.close();
        int count = Integer.parseInt(line);
        count++;
        if (count <= 3) {
            System.out.println("第" + count + "次运行");
        }else {
            System.out.println("超过三次了");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("W:\\Desktop\\demo\\count.txt"));
        bw.write(count + "");
        bw.close();
    }
}
