package bilibili.src.pt03;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.print(scoreArr[i] + " ");
        }
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);
        int avg = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("最终得分：" + avg);

    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围");
            }

        }
        return scores;
    }

    //求数组的最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    //求数组的最小值
    //快捷修改键 shift + f6
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    //数组求和
    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }
}
