package bilibili.src.pt09.test02;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraysDemo2 {
    public static void main(String[] args) {
        //重载方法sort，进行自定义排序方式
        Integer[] arr = {3,2,1,6,5,4,8,7,9};

        //简单理解：
        //o1 - o2 :升序排序
        //o2 - o1 :降序排序

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
