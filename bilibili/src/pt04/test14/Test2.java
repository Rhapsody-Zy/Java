package bilibili.src.pt04.test14;

public class Test2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "有马", 16);
        Student stu2 = new Student(2, "椿", 17);
        Student stu3 = new Student(3, "熏", 15);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求3：通过id删除学生信息
        //如果存在，则删除，不存在，则返回删除失败
        int index = getIndex(arr, 2);
        if (index >= 0) {
            arr[index] = null;
            printArr(arr);
        }else {
            System.out.println("当前id不存在，删除失败");
        }
    }

    //获取索引
    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        return -1;
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

    //创建新数组将就数组放进来
    //没用 不如直接 arr[i] = null;
    public static Student[] creatNewArr(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                count++;
            }
        }
        Student[] newArr = new Student[count];
        for (int i1 = 0; i1 < arr.length; i1++) {
            int j = 0;
            Student stu = arr[i1];
            if (stu != null) {
                newArr[j] = arr[i1];
                j++;
            }
        }
        return newArr;
    }

}
