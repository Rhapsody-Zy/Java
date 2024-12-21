package bilibili.src.pt16.a06TCPTest.Test03;

import org.apache.commons.io.input.ReaderInputStream;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10000);
        Socket socket = ss.accept();

        //使用UUID生成随机的图片名字
        String name = UUID.randomUUID().toString().replace("-", "");

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("W:\\Java\\bilibili\\src\\pt16\\a06TCPTest\\serverdir\\"+ name +".jpg"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read()) != -1) {
            bos.write(bytes,0,len);
        }

        //会写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        socket.close();


    }
}
