package bilibili.src.pt14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        //添加数据
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");
        prop.put("ddd","444");

        //将集合中的数据以键值对的方式写入到本地文件中
        FileOutputStream fos = new FileOutputStream("W:\\Java\\bilibili\\src\\pt14\\a.properties");
        prop.store(fos,"Test");

    }
}
