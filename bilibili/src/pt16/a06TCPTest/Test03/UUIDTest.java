package bilibili.src.pt16.a06TCPTest.Test03;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {

        //随机生成字符串
        String str = UUID.randomUUID().toString().replace("-", "");
        System.out.println(str);

    }
}
