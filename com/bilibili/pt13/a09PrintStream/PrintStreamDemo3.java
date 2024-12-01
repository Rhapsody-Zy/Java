package com.bilibili.pt13.a09PrintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo3 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("W:\\Desktop\\demo\\h.txt"),true);

        pw.println(97);

        pw.close();

    }
}
