package bilibili.src.pt06.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        //测试对象
        Student student = new Student("01","熏",16,"001号");
        list.add(student);

        loop: while (true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出管理系统");
            System.out.println("请输入您的选择：");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出管理系统");
                    //给while进行命名，break跳出while的循环
                    break loop;
                    //方法二
                    //System.exit(0); //停止虚拟机的运行

                }
                default -> System.out.println("没有这个选项");
            }
        }


    }

    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        while (true) {
            System.out.println("请输入要填加学生的id");
            String id = sc.next();
            boolean contain = contains(list,id);
            if (contain) {
                System.out.println("id重复了，请重新输入");
            }else {
                stu.setId(id);
                break;
            }
        }

        System.out.println("请输入要填加学生的姓名");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入要填加学生的年龄");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入要填加学生的家庭住址");
        String address = sc.next();
        stu.setAddress(address);

        list.add(stu);

        //提示
        System.out.println("信息添加成功！");
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        System.out.println("请输入要删除学生的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list,id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除成功!");
        }else {
            System.out.println("要删除的id不存在!");
        }

    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("请输入要修改学生的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        int index = getIndex(list,id);

        if (index >= 0) {
            Student stu = list.get(index);

            System.out.println("请输入要修改学生姓名");
            String newName = sc.next();
            stu.setName(newName);

            System.out.println("请输入要修改学生的年龄");
            int newAge = sc.nextInt();
            stu.setAge(newAge);

            System.out.println("请输入要修改学生的地址");
            String newAddress = sc.next();
            stu.setAddress(newAddress);

            System.out.println("学生id为" + id +"的信息修改成功！");

        }else {
            System.out.println("学生id为" + id +"的信息不存在");
            return;
        }
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        if (list.size() == 0) {
            System.out.println("当前无学生信息");
            return;
        }

        //打印表头信息
        System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" +s.getAddress());
        }


    }

    //判断id的唯一性
    public static boolean contains(ArrayList<Student> list,String id){
        if (getIndex(list,id) >= 0) {
            return true;
        }else {
            return false;
        }
    }

    //通过id返回索引的方法
    public static int getIndex(ArrayList<Student> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String sid = s.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
