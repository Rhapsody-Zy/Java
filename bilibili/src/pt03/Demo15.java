package bilibili.src.pt03;

public class Demo15 {
    public static void main(String[] args) {
        //1.创建二维数组存储数据
        int[][] yearArrArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        //2.遍历二维数组
        int year = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            int[] quarterArr = yearArrArr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i + 1) + "个季度的总营业额:"+ sum);
            year = year + sum;
        }
        System.out.println("全年营业额为：" + year);
    }
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
