package bilibili.src.pt05.test08;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素
        /*sb.append(1);
        sb.append(2.3);
        sb.append(true);*/

        //反转元素
        sb.reverse();   //cba

        //获取长度
        int len = sb.length();
        System.out.println(len);

        //因为StringBuilder时Java已经写好的类，java在底层对他做了一些特殊的处理
        //所以打印对象不是地址值而是属性值
        System.out.println(sb);
    }

}
