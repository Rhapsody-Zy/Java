package bilibili.src.pt12.a04Exception;

public class ExceptionDemo5 {
    public static void main(String[] args) {

        //抛出异常

        int[] arr = null;
        int max = 0;
        try {
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");;
        }
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        //手动创建一个异常对象，并把这个对象交给方法的调用者处理
        //此时方法结束，下面方法不会执行
        /*if (arr == null) {
            throw new NullPointerException();
        }*/

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
