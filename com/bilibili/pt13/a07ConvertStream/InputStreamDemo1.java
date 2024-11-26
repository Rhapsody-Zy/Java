package com.bilibili.pt13.a07ConvertStream;

import java.io.*;
import java.nio.charset.Charset;

public class InputStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //转换流

        /*
        利用转换流按照指定的字符编码读取（了解）
        JDK11：有了替代方案（掌握）
        */

        /*InputStreamReader isp = new InputStreamReader(new FileInputStream("W:\\Desktop\\demo\\gbkfile.txt"), "GBK");
        int ch;
        while ((ch = isp.read()) != -1) {
            System.out.print((char) ch);
        }
        isp.close();*/

        //替代方案
        FileReader fr = new FileReader("W:\\Desktop\\demo\\gbkfile.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }
}
