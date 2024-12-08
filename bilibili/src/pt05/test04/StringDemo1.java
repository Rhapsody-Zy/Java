package bilibili.src.pt05.test04;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //2.进行遍历
        //字符串的遍历要先.length() 在.fori
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }


    }
}
