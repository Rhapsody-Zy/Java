package bilibili.src.pt13.Test2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) throws IOException {

        //带权重的随机点名器

        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("W:\\Desktop\\demo\\name.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            String[] arr = str.split("-");
            Student stu = new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();

        //计算权重
        double weight = 0;
        for (Student stu : list) {
            weight += stu.getWeight();
        }

        //获取每个学生的权重，将权重写入一个arr中
        double[] arr = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).getWeight() / weight;
        }

        //计算每个人的权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        //随机抽取
        double number = Math.random();
        //判断 - 二分查找法
        //返回值为   -插入点 - 1
        int index = -Arrays.binarySearch(arr, number) - 1;
        Student stu = list.get(index);
        System.out.println(stu);

        //修改档期那学生的权重
        double w = stu.getWeight() / 2;
        stu.setWeight(w);

        //将新的权重信息写入文档中
        BufferedWriter bw = new BufferedWriter(new FileWriter("W:\\Desktop\\demo\\name.txt"));
        for (Student stu1 : list) {
            bw.write(stu1.toString());
            bw.newLine();
        }
        bw.close();

    }
}
