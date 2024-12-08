package bilibili.src.pt13.Test2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) throws IOException {

        //添加作弊功能 - 第三次必定是张三

        int i = 0;
        while (i < 10) {
            ArrayList<String> boyList = new ArrayList<>();
            ArrayList<String> girlList = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("W:\\Desktop\\demo\\name.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                String gender = s.split("-")[1];
                String name = s.split("-")[0];
                if (gender.equals("男")) {
                    boyList.add(name);
                }else{
                    girlList.add(name);
                }

            }
            br.close();

            ArrayList<Integer> list = new ArrayList<>();
            Collections.addAll(list,1,1,1,0,0,0,0,0,0,0);
            Collections.shuffle(list);
            Collections.shuffle(boyList);
            Collections.shuffle(girlList);
            if (i == 2) {
                System.out.println("张三");
            }else {
                if (list.get(0) == 0) {
                    System.out.println(boyList.get(0));
                }else {
                    System.out.println(girlList.get(0));
                }
            }
            i++;
        }
    }
}
