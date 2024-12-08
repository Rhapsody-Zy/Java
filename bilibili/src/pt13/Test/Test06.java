package bilibili.src.pt13.Test;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test06 {
    public static void main(String[] args) throws IOException {

        //对文档中的内容 按行进行排序 - 升级版

        BufferedReader br = new BufferedReader(new FileReader("W:\\Desktop\\demo\\csb.txt"));
        TreeMap<Integer, String> tm = new TreeMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("\\.");
            tm.put(Integer.parseInt(arr[0]), arr[1]);
        }
        br.close();

        //System.out.println(tm);

        BufferedWriter bw = new BufferedWriter(new FileWriter("W:\\Desktop\\demo\\csbCopy1.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            bw.write(value);
        }
        bw.close();

    }
}
