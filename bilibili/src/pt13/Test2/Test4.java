package bilibili.src.pt13.Test2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test4 {
    public static void main(String[] args) throws IOException {
        String src = "W:\\Desktop\\demo\\name.txt";
        String backup = "W:\\Desktop\\demo\\backup.txt";

        //第一次点名读取原始文件
        ArrayList<String> list = readFile(src);
        //第一边点完名后原始文件为空时
        if (list.size() == 0) {
            //从备份文件中读取信息
            list = readFile(backup);
            //将读取到的信息存到原始文件中
            writeFile(src,list,false);
            //删除备份文件
            new File(backup).delete();
        }
        //打乱list中的顺序
        Collections.shuffle(list);
        //将list中第一个元素抛出
        String stuInfo = list.remove(0);
        System.out.println(stuInfo);
        //将抛出后的list覆盖写入原始文件中
        writeFile(src,list,false);
        //将抛出的数据写到备份文件中
        writeFile(backup,stuInfo,true);


    }

    public static void writeFile(String pathFile, String name, boolean isAppend) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile,isAppend));
        bw.write(name);
        bw.newLine();
        bw.close();
    }

    public static void writeFile(String pathFile, ArrayList<String> list, boolean isAppend) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathFile,isAppend));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }

    public static ArrayList<String> readFile(String pathFile) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(pathFile));
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str);
        }
        br.close();
        return list;

    }
}
