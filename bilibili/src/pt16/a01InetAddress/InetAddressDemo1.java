package bilibili.src.pt16.a01InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {

        //获取InetAddress的对象
        InetAddress address = InetAddress.getByName("DESKTOP-FJISCCC");
        System.out.println(address);

        //获取此IP地址的主机名
        String name = address.getHostName();
        System.out.println(name);

        //返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();
        System.out.println(ip);

    }
}
