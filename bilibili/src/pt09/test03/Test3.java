package bilibili.src.pt09.test03;

public class Test3 {
    public static void main(String[] args) {

        //猴子吃桃

        int sum = getSum(10);
        System.out.println(sum);
    }

    public static int getSum(int day){
        if (day == 1) {
            return 1;
        }else {
            return (getSum(day - 1) + 1) * 2;
        }
    }
}
