package bilibili.src.pt08.test07;

public class RegexDemo03 {
    public static void main(String[] args) {

        //身份证号码的简单校验

        String regex1 = "[1-9]\\d{16}(\\d|X|x)";
        String regex2 = "[1-9]\\d{16}[\\dXx]";
        String regex5 = "[1-9]\\d{16}(\\d|(?i)x)";

        System.out.println("320324200203055414".matches(regex1));
        System.out.println("320324200203055414".matches(regex2));

        System.out.println("----------------------------");

        //忽略大小写
        //忽略abc的大小写
        String regex3 = "(?i)abc";
        System.out.println("Abc".matches(regex3));
        //忽略bc的大小写
        String regex4 = "a(?i)bc";
        System.out.println("Abc".matches(regex4));
        System.out.println("aBC".matches(regex4));

        System.out.println("----------------------------");

        //身份证号码的严格校验
        String regex6 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("320324200203055414".matches(regex6));
    }
}
