package bilibili.src.pt16.a06TCPTest.Test01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //多发多收
        //创建Socket对象并连接服务端
        Socket socket = new Socket("127.0.0.1",10000);

        //写入
        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();

        while (true) {
            System.out.println("要发送啥");
            String str = sc.nextLine();
            os.write(str.getBytes());
            if(str.equals("886")) {
                break;
            }
        }

        socket.close();


    }
}
