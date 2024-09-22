package com.bilibili.pt08.test03;

import java.io.IOException;

public class RuntimeDemo01 {
    public static void main(String[] args) throws IOException {

        /*
        public static   Runtime getRuntime()        当前系统的运行环境对象
        public void     exit(int status)            停止虚拟机
        public int      availableProcessors()       获得CPU的线程数
        public long     maxMemory()                 JVM能从系统中获取总内存大小（单位byte）
        public long     totalMemory()               JVM已经从系统中获取总内存大小（单位byte）
        public long     freeMemory()                JVM剩余内存大小（单位byte）
        public Process exec(String command)         运行cmd命令
        */


        //1.获取Runtime的对象
        //Runtime r1 = Runtime.getRuntime();

        //2.exit - 停止虚拟机
        //Runtime.getRuntime().exit(0);

        //3.获得CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //4.总内存大小
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //5.已经从系统中获取总内存大小
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //6.剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //7.运行cmd命令
        Runtime.getRuntime().exec("notepad");

    }
}
