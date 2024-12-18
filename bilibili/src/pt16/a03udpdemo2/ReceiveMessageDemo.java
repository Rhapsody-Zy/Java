package bilibili.src.pt16.a03udpdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(9999);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        while (true) {
            ds.receive(dp);

            byte[] data = dp.getData();
            int length = dp.getLength();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();
            String str = new String(data, 0, length);

            System.out.println("按收到数据" + str);
            System.out.println("该数据是从" + address + "这台电脑中的" + port + "这个端口发出的");
        }

    }
}
