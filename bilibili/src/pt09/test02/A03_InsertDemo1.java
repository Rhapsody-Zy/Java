package bilibili.src.pt09.test02;

public class A03_InsertDemo1 {
    public static void main(String[] args) {
        /*插入排序*/

        int[] arr = {2,43,12,35,65,22,13,15,32,52,17,10};

        //1.找到开头的有序数
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                startIndex = i + 1;
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        printArr(arr);
    }
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
