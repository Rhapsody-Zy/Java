package bilibili.src.pt02;


import java.util.Scanner;

//循环 判断
public class Demo1 {
    //if表达式
    //在语句体中，如果只有一句代码，大括号可以省略不写
    //如果对一个布尔类型的变量进行判断时，不要用==号，直接把变量写在小括号里面
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        if (number >= 10){
//            System.out.println(number);
//        }
//    }

    //switch
    //新特性
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number){
            case 1 -> {
                System.out.println('一');
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
        }
    }
}