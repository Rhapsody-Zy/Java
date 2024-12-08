package bilibili.src.pt05.test07;

public class StringDemo2 {
    public static void main(String[] args) {
        String id = "320324200203055414";

        //获取出生年月日 7-14位
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12, 14);

        System.out.println("出生年月日为" + year + "年" + month + "月" + day + "日");


        //获取性别 17位 奇数男 偶数女
        char gender = id.charAt(16);
        //将char转换成int类型
        int num = gender - 48;
        if (num %2 == 0) {
            System.out.println("女");
        }else {
            System.out.println("男");
        }
    }
}
