package bilibili.src.pt03;

//二维数组
public class Demo13 {
    public static void main(String[] args) {
        //1.静态初始化初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6,7}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6,7}};
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6,7}
        };
        //2.获取元素
        System.out.println(arr3[0][0]);

        //3.二维数组的遍历
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
