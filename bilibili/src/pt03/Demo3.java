package bilibili.src.pt03;


//通过方法进行数组遍历
public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};

        System.out.println("abc");  //先打印abc，再进行换行
        System.out.print("abc");    //只打印abc，不换行
        System.out.println();       //不打印任何数据，只进行换行

        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }

        }
        System.out.println("]");
    }
}
