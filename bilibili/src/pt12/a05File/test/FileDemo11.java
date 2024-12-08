package bilibili.src.pt12.a05File.test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileDemo11 {
    public static void main(String[] args) {

        File f1 = new File("W:\\Desktop");
        HashMap<String, Integer> hm = getCount(f1);
        System.out.println(hm);

    }

    public static HashMap<String,Integer> getCount(File f1) {
        HashMap<String,Integer> hm = new HashMap<>();
        File[] files = f1.listFiles();
        for (File file : files) {
            //判断 - 如果是文件的话，则进行统计
            if (file.isFile()) {
                String[] arr = file.getName().split("\\.");
                if (arr.length >= 2) {
                    String endName = arr[arr.length - 1];
                    if (hm.containsKey(endName)) {
                        Integer count = hm.get(endName);
                        count++;
                        hm.put(endName,count);
                    }else {
                        hm.put(endName,1);
                    }
                }
            //不是文件的话 - 进行递归
            }else {
                //需要将子文件夹中的hashmap和大文件夹中的统计结果相加
                HashMap<String, Integer> sonMap = getCount(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if (hm.containsKey(key)) {
                        Integer i = hm.get(key);
                        i = i + value;
                        hm.put(key,i);
                    }else {
                        hm.put(key,value);
                    }
                }
            }
        }
        return hm;
    }

}
