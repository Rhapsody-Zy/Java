package bilibili.src.pt05.test08;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //添加字符串
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        System.out.println(sb);

        //再把StringBuilder变回字符串类型
        String str = sb.toString();

        System.out.println(str);
    }
}
