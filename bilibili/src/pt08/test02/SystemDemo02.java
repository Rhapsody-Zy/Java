package bilibili.src.pt08.test02;

public class SystemDemo02 {
    public static void main(String[] args) {
        //判断一个数是否为质数

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            boolean flag = newIsPrime(i);
            if (flag) {
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //方法二

    public static boolean newIsPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
