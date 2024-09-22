package com.bilibili.pt04.test14;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1,"有马",16);
        Student stu2 = new Student(2,"椿",17);
        //Student stu3 = new Student(3,"熏",15);
        arr[0] = stu1;
        arr[1] = stu2;
        //arr[2] = stu3;

        //要求1：再次添加一个学生对象，并在添加时进行学号的唯一性判断
        Student stu4 = new Student(4,"友人A",18);

        //唯一性判断
        //已存在 -- 不用添加
        //不存在 -- 添加进数组
        boolean flag = contains(arr,stu4.getId());
        if (flag) {
            //已存在 -- 不用添加
            System.out.println("当前id重复");
        }else {
            //不存在 -- 添加进数组
            //把stu4添加进数组中
            //1.数组已经满了 -- 只能创建一个新的数组，新数组的长度 = 老数组 + 1
            //2.数组没有存满 -- 直接添加
            int count = getCount(arr);
            if (count == arr.length){
                //已经存满
                //创建一个新数组，长度=老数组长度+1
                //然后把老数组的元素拷贝到新数组中
                Student[] newArr = creatNewArr(arr);
                //把新元素添加进去
                newArr[count] = stu4;

                //2.遍历数组
                printArr(newArr);
            }else {
                //没有存满
                arr[count] = stu4;

                //2.遍历数组
                printArr(arr);
            }
        }


    }
    //定义判断唯一性的方法
    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //获取数组中学生对象的id
            if (stu != null){
                int sid = stu.getId();
                if (id == sid) {
                    return true;
                }
            }
        }
        return false;
    }


    //定义一个方法判断数组中已经存了几个元素
    //通过对比数组中的位置值是否为NULL从而判断数组中有多少元素
    public static int getCount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                count++;
            }
        }
        return count;
    }

    //创建新数组
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length+1];
        //循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;

    }

    //遍历数组
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId()+", "+stu.getName()+", "+stu.getAge());
            }
        }
    }
}
