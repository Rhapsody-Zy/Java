package bilibili.src.pt12.a04Exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        /*
        try catch
        好处：出现异常时可以让程序继续往下执行，不停止
        */

        int[] arr = {1,2,3,4,5};

        try {
            //可能出现异常的代码
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e) {
            //如果出现了这个异常，将怎么做
            System.out.println("索引越界");
        }
        System.out.println("继续执行");

    }
}
