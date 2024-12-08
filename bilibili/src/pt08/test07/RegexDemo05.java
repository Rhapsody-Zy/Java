package bilibili.src.pt08.test07;

//带条件爬取

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo05 {
    public static void main(String[] args) {

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11," +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候，只获取前半部分

        //需求1：爬取版本号为8，11，17的Java文本，但是只要Java，不显示版本号
        String regex1 = "Java(?=8|11|17)";

        //需求2：爬取版本号为8,11,17的Java文本。正确爬取结果为：Java8 Java11 Java17 Java17
        String regex2 = "Java(8|11|17)";
        String regex3 = "Java(?:8|11|17)";

        //需求3：爬取除了版本号为8，11，17的Java文本
        String regex4 = "Java(?!8|11|17)";


        Pattern p = Pattern.compile(regex3);
        Matcher m = p.matcher(str);
        while (m.find()) {
            str = m.group();
            System.out.println(str);
        }





    }
}
