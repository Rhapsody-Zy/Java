package bilibili.src.pt16.a05tcpdemo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        //创建Socket对象
        //细节：在创建对象的同时会连接服务器，如果连不上，则会报错
        Socket socket = new Socket("127.0.0.1",10000);

        OutputStream os = socket.getOutputStream();
        os.write("呀呼".getBytes());

        os.close();
        socket.close();


    }
}
