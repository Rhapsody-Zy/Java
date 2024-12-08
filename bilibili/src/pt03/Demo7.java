package bilibili.src.pt03;


import java.util.Random;

//生成随机验证码
public class Demo7 {
    public static void main(String[] args) {
        //1.将大小写字母都放到数组里
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25){
                chs[i] = (char)(97+i);
            }else {
                chs[i] = (char)(65+i-26);
            }
        }
        //定义一个字符串类型的变量，用来记录最终的结果
        String result = "";
        //2.随机抽取4次
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            //System.out.print(chs[randomIndex]+" ");
            result = result + chs[randomIndex];
        }
        //3.抽取随机数字进行拼接
        int number = r.nextInt(10);
        result = result + number;
        System.out.println(result);
    }
}

