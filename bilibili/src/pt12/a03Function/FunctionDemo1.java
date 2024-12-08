package bilibili.src.pt12.a03Function;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {

        //方法引用
        //排序
        Integer[] arr = {2,1,4,5,3};

        //匿名内部类
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/

        //lambda表达式
        //Arrays.sort(arr,(o1, o2) -> o2 - o1);

        //方法引用
        //1.引用处需要是函数式接口
        //2.被引用的方法需要已经存在
        //3.被引用方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        //4.被引用方法的功能需要满足当前的需求

        Arrays.sort(arr, FunctionDemo1::subtraction);

        System.out.println(Arrays.toString(arr));


    }
    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}
