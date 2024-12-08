package bilibili.src.pt09.test01;

public class BasicSearchDemo01 {
    public static void main(String[] args) {
        //基本查找/顺序查找
        //核心：从0索引开始挨个往后查找

        int[] arr = {110,12,2,43,24,745,235,234,422};
        int number = 2;
        boolean result = basicSearch(arr, number);
        System.out.println(result);


    }

    public static boolean basicSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;

    }


}
