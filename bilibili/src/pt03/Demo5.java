package bilibili.src.pt03;


//拷贝指定数组到新数组
public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] copyarr = copyOfrange(arr,3,7);
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print(copyarr[i]+" ");
        }
    }

    public static int[] copyOfrange(int[] arr,int from, int to){
        //定义新数组
        int[] newarr = new int[to - from];
        //伪造索引的思想
        int index = 0;
        for(int i = from;i < to;i++){
            newarr[index] = arr[i];
            index++;
        }
        return newarr;
    }
}
