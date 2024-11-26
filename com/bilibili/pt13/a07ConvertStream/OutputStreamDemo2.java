package com.bilibili.pt13.a07ConvertStream;

import java.io.*;
import java.nio.charset.Charset;

public class OutputStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //转换输出流

        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("W:\\Desktop\\demo\\f.txt"));
        osw.write("狂想曲");
        osw.close();*/

        FileWriter fw = new FileWriter("W:\\Desktop\\demo\\f.txt", Charset.forName("GBK"));
        fw.write("编码");
        fw.close();

    }
}
