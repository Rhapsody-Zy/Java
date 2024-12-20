package bilibili.src.pt16.a06TCPTest.Test02;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10000);
        Socket socket = ss.accept();

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        int b;
        //细节：
        //read方法会从连接通道中读取数据
        //但是需要一个结束标记，此处的循环才会结束
        //否则，循环会一直停在read方法处
        while ((b = isr.read()) != -1) {
            System.out.println((char) b);
        }

        //回写数据
        OutputStream os = socket.getOutputStream();
        String str = "你也好";
        os.write(str.getBytes());


        socket.close();
        ss.close();
    }
}
