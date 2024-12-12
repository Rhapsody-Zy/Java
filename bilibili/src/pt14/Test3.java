package bilibili.src.pt14;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        //读取配置文件
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("W:\\Java\\bilibili\\src\\pt14\\a.properties");
        prop.load(fis);
        fis.close();
        System.out.println(prop);


    }
}
