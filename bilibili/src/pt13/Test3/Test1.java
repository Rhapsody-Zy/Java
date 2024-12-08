package bilibili.src.pt13.Test3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {

        //登录
        BufferedReader br = new BufferedReader(new FileReader("W:\\Java\\bilibili\\src\\pt13\\Test3\\userinfo.txt"));
        String line = br.readLine();
        br.close();
        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");

        String rightName = arr1[1];
        String rightPassword = arr2[1];

        //用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("用户名");
        String username = sc.nextLine();
        System.out.println("密码");
        String password = sc.nextLine();

        if (rightName.equals(username) && rightPassword.equals(password)) {
            System.out.println("密码对了");
        }else {
            System.out.println("错了");
        }

    }
}
