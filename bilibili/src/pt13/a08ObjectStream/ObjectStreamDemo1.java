package bilibili.src.pt13.a08ObjectStream;

import java.io.*;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {

        //使用 对象输出流(序列化流) 将对象保存到文件时会出现NotSerializableException异常
        //需要让JavaBean类实现Serializable接口

        Student stu = new Student("JOJO",19);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("W:\\Desktop\\demo\\ObjectStream.txt"));

        oos.writeObject(stu);

        oos.close();
    }
}
