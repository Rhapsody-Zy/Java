package bilibili.src.pt03;


import java.util.Random;
import java.util.Scanner;

//双色球
public class Demo12 {
    public static void main(String[] args) {
        //生成中奖号码
        int[] zjArr = zjArr();
        System.out.println("=======================");
        for (int i = 0; i < zjArr.length; i++) {
            System.out.print(zjArr[i]+" ");
        }
        System.out.println();
        System.out.println("=======================");
        int[] srArr = srArr();

        //3.判断中奖情况
        int redCount = 0,blueCount = 0;
        //判断红球的中奖情况
        for (int i1 = 0; i1 < srArr.length-1; i1++) {
            for (int i2 = 0; i2 < zjArr.length-1; i2++) {
                if (srArr[i1] == zjArr[i2]){
                    redCount+=1;
                    break;
                }
            }
        }
        //判断蓝球中奖情况
        if (srArr[6] == zjArr[6]){
            blueCount+=1;
        }
        if (redCount ==6 & blueCount == 1){
            System.out.println("一等奖");
        }else if (redCount == 6 && blueCount == 0){
            System.out.println("二等奖");
        }else if (redCount == 5 && blueCount ==1){
            System.out.println("三等奖");
        }else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount ==1)){
            System.out.println("四等奖");
        }else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount ==1)){
            System.out.println("五等奖");
        }else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount ==1) || (redCount == 0 && blueCount ==1)){
            System.out.println("六等奖");
        }else {
            System.out.println("谢谢惠顾");
        }
    }
    //1.定义数组存放随机生成的中奖号码
    public static int[] zjArr(){
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length-1;) {
            int redNumber = r.nextInt(1,34);
            boolean flag = contains(arr,redNumber);
            if (!flag){
                arr[i] = r.nextInt(1,34);
                i++;
            }
        }
        arr[6] = r.nextInt(1,17);
        return arr;
    }

    //2.录入用户的中奖号码
    public static int[] srArr(){
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length-1;) {
            System.out.println("请输入第" + (i+1)+"红球号码");
            int num = sc.nextInt();
            if (num >=1 && num <=33){
                boolean flag = contains(arr,num);
                if (!flag){
                    arr[i] = num;
                    i++;
                }else{
                    System.out.println("号码重复了");
                }
            }else{
                System.out.println("号码超出范围");
            }
        }
        System.out.println("请输入你的蓝球号码");
        int num = sc.nextInt();
        if (num >=1 && num <=33){
            arr[6] = num;
        }else{
            System.out.println("号码超出范围");
        }
        return arr;
    }

    //判断红球号码是否重复
    public static boolean contains(int[] arr,int redNumber){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == redNumber){
                return true;
            }
        }
        return false;
    }
}
