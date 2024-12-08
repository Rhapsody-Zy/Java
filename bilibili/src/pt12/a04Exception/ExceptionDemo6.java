package bilibili.src.pt12.a04Exception;

import java.util.Scanner;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        //练习
        //限制姓名在3 - 10 之间
        //限制年龄在18 - 25 之间

        //创对象
        Scanner sc = new Scanner(System.in);
        Student2 stu = new Student2();

        while (true) {
            try {
                //输入姓名
                System.out.println("输入姓名");
                String name = sc.nextLine();
                stu.setName(name);

                //输入年龄
                System.out.println("输入年龄");
                String strAge = sc.nextLine();
                stu.setAge(Integer.parseInt(strAge));

                //如果上面都正确，则跳出死循环
                break;

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }catch (NameFormatException e) {
                e.printStackTrace();
            }catch (AgeOutOfBoundException e) {
                e.printStackTrace();
            }
        }

        System.out.println(stu);

    }
}
