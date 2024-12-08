package bilibili.src.pt08.test07;

public class RegexDemo10 {
    public static void main(String[] args) {
        //非捕获分组
        //分组之后不需要再用本组数据，仅仅是把数据括起来
        //特点：不占用组号

        // (?:) (?=) (?!) 都是捕获分组

        String str = "[1-9]\\d{16}(?:\\d|X|x)";
        //此时括号内是不占用组号的


    }


}
