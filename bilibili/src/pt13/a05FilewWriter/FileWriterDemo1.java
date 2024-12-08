package bilibili.src.pt13.a05FilewWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {

        /*
        ① 创建字符输出流对象
            细节1：参数是字符串表示的路径或者File对象都是可以的
            细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
            细节3：如果文件已经存在，则会清空文件，如果不想清空可以打开续写开关
        ② 写数据
            细节：如果write方法的参数是整数，但是实际上写到本地文件中的是整数在字符集上对应的字符
        ③释放资源
            细节：每次使用完流之后都要释放资源
        */

        FileWriter fw = new FileWriter("W:\\Desktop\\demo\\c.txt");
        fw.write(25105);
        fw.write("目光所及之处，皆是爱意满怀。");
        fw.close();
    }
}
