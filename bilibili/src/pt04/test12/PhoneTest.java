package bilibili.src.pt04.test12;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //定义存放手机的数组
        Phone[] arr = new Phone[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Phone p = new Phone();
            System.out.println("请输入手机品牌：");
            String brand = sc.next();
            p.setBrand(brand);
            System.out.println("请输入手机价格：");
            int price = sc.nextInt();
            p.setPrice(price);
            System.out.println("请输入手机颜色：");
            String color = sc.next();
            p.setColor(color);

            arr[i] = p;
        }
        int avgPrice = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone p = arr[i];
            avgPrice = avgPrice + p.getPrice();
            System.out.println(p.getBrand()+", "+p.getPrice()+", "+p.getColor());
        }
        double avgPrice2 = avgPrice * 1.0/(arr.length);
        System.out.println(avgPrice2);
    }
}
