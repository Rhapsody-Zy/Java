package bilibili.src.pt09.test02;

import java.util.Random;

public class A04_QuickSortDemo1 {
    public static void main(String[] args) {

        /*快速排序
            第一轮：以0索引的数字为“基准数”，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
        */

        //int[] arr = {6,1,2,7,9,3,4,5,8,10};

        int[] arr = new int[1000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        long start = System.currentTimeMillis();
        quickSort(arr,0,arr.length-1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/


    }
    public static void quickSort(int[] arr, int i, int j) {
        //定义两个变量用于记录要查找的范围
        int start = i;
        int end = j;

        //程序出口
        if (start > end) {
            return;
        }

        //记录基准数
        int baseNumber = arr[i];
        //利用循环找到要交换的数字
        while (start != end) {
            //利用end往前找，找比基准数要小的数字
            while (true) {
                if (end<=start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //利用start往后找，找比基准数要大的数字
            while (true) {
                if (end<=start || arr[start] > baseNumber){
                    break;
                }
                start++;
            }
            //把end和start指向的数进行互换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //当start和end指向同一个元素时，上面循环结束
        //基准数归位

        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //经过上面操作后，基准数左边的数都比他小，右边的数都比他大
        //因此他往后的操作不需要再进行基准数归位
        // 基准数左边的范围重复上面的方法，基准数右边也重复上面算法
        quickSort(arr,0,start - 1);
        quickSort(arr,start + 1,j);
    }
}
