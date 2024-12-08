package bilibili.src.pt01;
//键盘录入

//1.导包，要写在类上面
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("请输入整数：");
        //2.创建对象
        Scanner sc = new Scanner(System.in);
        //3.接收数据
        int i = sc.nextInt();
        System.out.println(i);

    }
}
 