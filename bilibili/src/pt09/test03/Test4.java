package bilibili.src.pt09.test03;

public class Test4 {
    public static void main(String[] args) {
        int count = getCount(20);
        System.out.println(count);
    }

    public static int getCount(int n){
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }else if (n == 3) {
            return 4;
        }else {
            return getCount(n - 1) + getCount(n - 2) + getCount(n - 3);
        }
    }
}
