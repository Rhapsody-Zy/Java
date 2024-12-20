package bilibili.src.pt16.a06TCPTest.Test02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",10000);

        OutputStream os = socket.getOutputStream();
        String str = "你好";
        os.write(str.getBytes());

        socket.shutdownOutput();

        InputStreamReader isr = new InputStreamReader(socket.getInputStream());

        int b;
        while ((b = isr.read()) != -1) {
            System.out.println((char) b);
        }

        socket.close();

    }
}
