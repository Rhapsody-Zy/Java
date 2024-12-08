package bilibili.src.pt13.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) throws IOException {
        //对文件中的数字进行排序 - 升级版

        FileReader fr = new FileReader("W:\\Desktop\\demo\\d.txt");
        StringBuilder sb = new StringBuilder();

        //读取文件中的内容，存储到sb中
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char)ch);
        }
        fr.close();

        //排序
        Integer[] arr = Arrays.stream(sb.toString()
                        .split("-"))
                        .map(Integer::parseInt)
                        .sorted()
                        .toArray(Integer[]::new);

        //写出
        FileWriter fw = new FileWriter("W:\\Desktop\\demo\\d.txt");
        String s = Arrays.toString(arr).replace(", ", "-");
        String result = s.substring(1, s.length() - 1);
        fw.write(result);
        fw.close();
    }



}
