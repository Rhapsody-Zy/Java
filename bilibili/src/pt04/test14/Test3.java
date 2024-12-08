package bilibili.src.pt04.test14;

public class Test3 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "有马", 16);
        Student stu2 = new Student(2, "椿", 17);
        Student stu3 = new Student(3, "熏", 15);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求：找到id为2的学生，如果存在，则将他的年龄加1
        //4.获取id为2的学生索引
        int index = getIndex(arr,2);

        if (index >= 0) {
            Student stu = arr[index];
            int newAge = stu.getAge()+1;
            stu.setAge(newAge);
            printArr(arr);
        }else {
            System.out.println("当前id不存在");
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
}
