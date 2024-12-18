package bilibili.src.pt16.a03udpdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入数据");
            String str = sc.nextLine();
            if (str.equals("886")){
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 9999;

            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

            ds.send(dp);
        }

        ds.close();

    }
}
