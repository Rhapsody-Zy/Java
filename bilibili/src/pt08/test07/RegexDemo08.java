package bilibili.src.pt08.test07;

//捕获分组和非捕获分组

public class RegexDemo08 {
    public static void main(String[] args) {

        //1：判断一个字符串的开始字符和结束字符是否一致？只考虑一个字符
        //举例：a123a  b456b  17891  &abc&  a123b(false)

        // \\组号：表示把第X组的内容再出来用一次

        String regex1 ="(.).+\\1";

        System.out. println("a123a".matches(regex1));

        //2：判断一个字符串的开始部分和结束部分是否一致？可以有多个字符
        //举例：abc123abc  b456b  123789123  &!@abc&!@  abc123abd(false)

        String regex2 = "(.+).+\\1";
        System.out.println("123789123".matches(regex2));

        //3：判断一个字符串的开始部分和结束部分是否一致？开始部分内部每个字符也需要一致
        //举例：aaa123aaa  bbb456bbb  111789111  &&abc&&



    }

}
