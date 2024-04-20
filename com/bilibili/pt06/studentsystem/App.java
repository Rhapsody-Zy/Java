package com.bilibili.pt06.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        loop: while (true) {
            //登录界面
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码 4退出");

            //键盘录入选项
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("输入选项无效，请重新输入");
            }
        }


    }

    //登录
    private static void login(ArrayList<User> list) {
    }

    //注册功能方法
    private static void register(ArrayList<User> list) {
        User user = new User();
        Scanner sc = new Scanner(System.in);

        //1.键盘录入用户名
        while (true) {
            //输入用户名
            System.out.println("请输入用户名");
            String username = sc.next();

            //检查用户名格式
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("用户名不满足条件，请重新输入");
                continue;
            }

            //检验用户名唯一性
            boolean flag2 = contains(list,username);

            if (flag2) {
                System.out.println("用户名重复，请重新输入");
                continue;
            }else {
                break;
            }
        }

        //2.键盘录入密码
        while (true) {
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("请再次输入密码");
            String password1 = sc.next();

            if (!password.equals(password1)) {
                System.out.println("两次密码不一致，请重新输入");
                continue;
            }else {
                break;
            }
        }

        //3.键盘录入身份证号码
        while (true) {
            System.out.println("请输入身份证号码");
            String personID = sc.next();


        }




    }



    //忘记密码
    private static void forgetPassword(ArrayList<User> list) {
    }


    //检查用户名格式
    private static boolean checkUsername(String username) {
        //用户名长度必须在3~15位之间
		//只能是字母加数字的组合，但是不能是纯数字
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }

        //校验-只能是字母加数字的组合
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }
        //校验-但是不能是纯数字
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count ++;
                break;
            }
        }
        return count > 0;
    }

    //判断id的唯一性
    public static boolean contains(ArrayList<User> list,String id){
        if (getIndex(list,id) >= 0) {
            return true;
        }else {
            return false;
        }
    }

    //通过id返回索引的方法
    public static int getIndex(ArrayList<User> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            User s = list.get(i);
            String sid = s.getUsername();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }


    //检查身份证号码格式
    public static boolean checkPersonID (String personID) {
        int len = personID.length();
        if (len != 18) {
            return false;
        }

        char c1 = personID.charAt(0);
        if (c1 == '0') {
            return false;
        }

        for (int i = 1; i < 17; i++) {
            char c2 = personID.charAt(i);
            if (!(c2 >= '0' && c2 <= '9')) {
                return false;
            }
        }
    }

}
