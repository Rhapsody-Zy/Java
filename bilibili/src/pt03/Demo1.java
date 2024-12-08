package bilibili.src.pt03;

public class Demo1 {
    public static void main(String[] args) {
        //调用方法
        playGame();
        method(10,20);
    }
    //定义方法
    public static void playGame(){
        System.out.println("对线");
    }
    //带参数方法
    public static void method(int num1,int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

}
