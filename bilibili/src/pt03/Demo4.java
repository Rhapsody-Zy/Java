package bilibili.src.pt03;

//调用方法求最大值
public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,5,7,8,9};
        System.out.println(getMax(arr));

    }

    public static int getMax(int[] arr){
        int max = arr[0];   //将max初始化为arr[0]
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
