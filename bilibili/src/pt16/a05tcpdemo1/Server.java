package bilibili.src.pt16.a05tcpdemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10000);

        //监听客户端连接
        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        //转换流
        InputStreamReader isr = new InputStreamReader(is);
        //缓冲流
        BufferedReader br = new BufferedReader(isr);
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }

        //释放资源
        socket.close();
        ss.close();


    }
}
