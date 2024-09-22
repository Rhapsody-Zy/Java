package com.bilibili.pt08.test07;

//贪婪爬取 非贪婪爬取

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo06 {
    public static void main(String[] args) {

        /*

        贪婪爬取：在爬取数据时尽可能多获取数据
        非贪婪爬取：在爬取数据时尽可能少获取数据

        只写+和*表示贪婪爬取

        +？表示非贪婪爬取
        *？表示非贪婪爬取

        */

        String str = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaa经历了很多版本，目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //贪婪
        String regex1 = "ab+?";

        //非贪婪
        String regex2 = "ab+?";

        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(str);

        while (m.find()) {
            System.out.println(m.group());
        }


    }

}
