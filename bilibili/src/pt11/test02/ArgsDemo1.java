package bilibili.src.pt11.test02;

public class ArgsDemo1 {
    public static void main(String[] args) {

        //计算不固定个数 数据的和

        int[] arr = {1,2,3,4};
        System.out.println(getSum(arr));

    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
