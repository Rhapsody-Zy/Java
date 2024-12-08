package bilibili.src.pt08.test02;

public class SystemDemo03 {

    //拷贝数组
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];

        System.arraycopy(arr1,0,arr2,0,10);
        //把arr1数组中的数据拷贝到arr2中
        //参数一：数据源，要拷贝的数据从哪个数组而来
        //参数二：从数据源数组中的第几个索引开始拷贝
        //参数三：目的地，我要把数据拷贝到哪个数组中
        //参数四：目的地数组的索引。
        //参数五：拷贝的个数

        //细节
        //1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        // 2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
        //3.如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型



        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
