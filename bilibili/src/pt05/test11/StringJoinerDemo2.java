package bilibili.src.pt05.test11;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");

        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();  //计算的长度包含括号、逗号、空格等
        System.out.println(len); //13

        System.out.println(sj);

        String str = sj.toString();
        System.out.println(str);
    }
}
