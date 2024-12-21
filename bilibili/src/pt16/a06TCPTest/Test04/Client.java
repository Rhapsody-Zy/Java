package bilibili.src.pt16.a06TCPTest.Test04;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        //1.创建socket对象，并连接服务器
        Socket socket = new Socket("127.0.0.1",10000);

        //2.读取本地文件，并写入到服务器
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("W:\\Java\\bilibili\\src\\pt16\\a06TCPTest\\clientdir\\a.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        socket.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);

        socket.close();


    }
}
