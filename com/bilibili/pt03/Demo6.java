package com.bilibili.pt03;


import java.util.Scanner;

/*机票价格按照淡旺季、头等舱和经济舱进行收费，输入机票原价、月份、头等舱或经济舱，计算价格*/
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int mouth = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();

//        if(mouth >=5 && mouth <=10){
//            if (seat == 0){
//                ticket = (int)(ticket * 0.9);
//            }else if (seat == 1){
//                ticket = (int)(ticket * 0.85);
//            }else{
//                System.out.println("没有这个舱位");
//            }
//        }else if ((mouth >= 1 && mouth <=4) || (mouth >= 11 && mouth <=12)){
//            if (seat == 0){
//                ticket = (int)(ticket * 0.7);
//            }else if (seat == 1){
//                ticket = (int)(ticket * 0.65);
//            }else{
//                System.out.println("没有这个舱位");
//            }
//        }else {
//            System.out.println("输入的月份不合法");
//        }
//        System.out.println(ticket);

//      ctrl + alt + m  自动抽取方法
        if(mouth >=5 && mouth <=10){
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        }else if ((mouth >= 1 && mouth <=4) || (mouth >= 11 && mouth <=12)){
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        }else {
            System.out.println("输入的月份不合法");
        }
        System.out.println(ticket);
    }

    private static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
