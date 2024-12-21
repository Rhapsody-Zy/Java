package bilibili.src.pt16.a06TCPTest.Test04;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{

    Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try {
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


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (socket == null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
