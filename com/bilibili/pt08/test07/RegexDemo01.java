package com.bilibili.pt08.test07;

public class RegexDemo01 {
    public static void main(String[] args) {

        //作用：1、校验字符串是否满足规则；
        //     2、在一段文本中查找满足要求的内容；

        //API文档 搜 pattern

        //字符类

        //细节：如果要求两个范围的交集，那么需要写符号 &&
        //如果写成了一个 & ，那么此时&表示的就不是交集，而是一个简简单单的&符号
        System.out.println("a".matches("[a-z&[def]]"));     //true
        System.out.println("&".matches("[a-z&[def]]"));     //true
        System.out.println("&".matches("[a-z&&[def]]"));    //false


        System.out.println("zz".matches("[^abc][^abc]"));    //true

        System.out.println("----------预定义字符-----------");
        //预定义字符（只匹配一个字符）
        // \ 转义字符   改变后面那个字符原本的含义

        //此时\表示转义字符，改变了后面那个和双引号原本的含义
        //把他变成了一个普普通通的双引号而已
        System.out.println("\"");
        // \ 表示转义字符
        // \\ 前面的\是一个转义字符，改变了后面\原本的含义，把他变成了一个普普通通的\
        System.out.println("C:\\sss\\ss");

        // . 表示任意的一个字符
        System.out.println("你".matches(".."));      //false
        System.out.println("你".matches("."));       //true
        System.out.println("你啊".matches(".."));     //true

        System.out.println("-------------\\d--------------");

        // \\d 表示任意一个数字
        // \\d 只能表示一个数字
        // 两个\\表示一个\
        System.out.println("a".matches("\\d"));     //false
        System.out.println("1".matches("\\d"));     //true
        System.out.println("111".matches("\\d\\d\\d"));     //true

        System.out.println("-------------\\w-------------");

        // \\w 只能是一位单词字符 [a-zA-Z_0-9]
        System.out.println("a".matches("\\w"));     //true
        System.out.println("2".matches("\\w"));     //true
        System.out.println("22".matches("\\w"));     //false
        System.out.println("22".matches("\\w\\w"));     //true
        System.out.println("_".matches("\\w"));     //true

        // \\W 非单词字符
        System.out.println("我".matches("\\W"));     //true

        //以上正则匹配只能校验单个字符

        //X?        X，一次或0次
        //x*        X，零次或多次
        //X+        X，一次或多次
        //X{n}      X，正好n次
        //X{n,}    X，至少n次
        //X{n,m}    X，至少n但不超过m次

        System.out.println("---------------");

        System.out.println("324sdfs42423".matches("\\w{6,}"));  //true
        System.out.println("324".matches("\\w{6,}"));  //false

        System.out.println("12ab".matches("[a-zA-Z0-9]{4}"));  //true
        System.out.println("12_b".matches("[a-zA-Z0-9]{4}"));  //false
        System.out.println("12ab".matches("[\\w&&[^_]]{4}"));  //true



    }
}
