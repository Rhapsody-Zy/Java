package bilibili.src.pt05.test07;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.获取对话
        String talk = "你玩的真好，以后别玩了，TMD,FW,EZ";

        //2.定义一个敏感词库
        String[] arr = {"TMD","SB","FW","EZ"};

        //3.循环替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
