package com.bilibili.pt06.studentsystem;

import java.util.ArrayList;
import java.util.Random;
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
                case "5" -> showUser(list);
                default -> System.out.println("输入选项无效，请重新输入");
            }
        }


    }


    //测试用 - 遍历list中的用户
    private static void showUser(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", " + user.getPersonID() + ", " + user.getPhoneNumber());
        }


    }

    //一、登录
    private static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        //1.录入用户名
        while (true) {
            System.out.println("请输入用户名");
            String username = sc.next();
            boolean flag = contains(list,username);
            if (!flag) {
                System.out.println("用户名未注册，请先注册");
                continue;
            }else {
                //获取用户名在list中的下标
                index = getIndex(list,username);
                break;
            }
        }

        //4.判断密码是否正确
        String password1 = list.get(index).getPassword();
        for (int i = 0; i < 3; i++) {
            //2.录入密码
            System.out.println("请输入密码");
            String password = sc.next();

            //3.录入验证码
            while (true) {
                //生成验证码
                String yzm = getCode();
                System.out.println("请输入验证码 " + yzm);
                String yzm1 = sc.next();
                if (!yzm.equals(yzm1)) {
                    System.out.println("验证码错误，请重新输入");
                    continue;
                }else {
                    break;
                }
            }
            if (password1.equals(password)) {
                System.out.println("登录成功");
                break;
            }else {
                if (i==2) {
                    System.out.println("当前账号已暂时锁定，请点击忘记密码");
                }else {
                    System.out.println("密码错误，您好有" + (2-i) +"次机会");
                }
            }
        }

    }

    //二、注册功能方法
    private static void register(ArrayList<User> list) {

        //新建user对象
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
                user.setUsername(username);
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
                user.setPassword(password);
                break;
            }
        }

        //3.键盘录入身份证号码
        while (true) {
            System.out.println("请输入身份证号码");
            String personID = sc.next();
            boolean flag3 = checkPersonID(personID);
            if (!flag3) {
                System.out.println("身份证号码不合法，请重新输入");
                continue;
            }else {
                user.setPersonID(personID);
                break;
            }

        }

        //4.键盘录入手机号
        while (true) {
            System.out.println("请输入手机号");
            String phoneNumber = sc.next();
            checkPhoneNUmber(phoneNumber);
            boolean flag4 = checkPhoneNUmber(phoneNumber);
            if (!flag4) {
                System.out.println("请输入正确的手机号");
                continue;
            }else {
                user.setPhoneNumber(phoneNumber);
                break;
            }
        }

        //将user对象添加到list中
        list.add(user);
        System.out.println("注册成功");

    }


    //三、忘记密码
    private static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            //1.录入用户名
            System.out.println("请输入用户名");
            String username = sc.next();
            boolean flag = contains(list, username);
            if (!flag) {
                System.out.println("用户名未注册");
                break;
            }

            //获取这个用户名在list中的索引
            int index = getIndex(list,username);

            //2.录入身份证号和手机号进行判断
            System.out.println("请输入身份证号");
            String personID = sc.next();
            System.out.println("请输入手机号");
            String phoneNumber = sc.next();

            boolean flag2 = checkPersonID(list,personID,phoneNumber,index);
            if (!flag2) {
                System.out.println("账号信息不匹配，修改失败");
                continue;
            }

            //3.录入新的密码
            System.out.println("请输入新的密码");
            String new_password = sc.next();
            User user = list.get(index);
            user.setPassword(new_password);
            break;
        }
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

    //判断用户名的唯一性
    public static boolean contains(ArrayList<User> list,String username){
        if (getIndex(list,username) >= 0) {
            return true;
        }else {
            return false;
        }
    }

    //通过用户名返回索引的方法
    public static int getIndex(ArrayList<User> list,String username) {
        for (int i = 0; i < list.size(); i++) {
            User s = list.get(i);
            String username1 = s.getUsername();
            if (username1.equals(username)) {
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

        char c3 = personID.charAt(17);
        if (!((c3 >= '0' && c3 <= '9') || (c3 == 'x') || (c3 == 'X'))) {
            return false;
        }
        return true;
    }

    //检查手机号格式
    private static boolean checkPhoneNUmber(String phoneNumber) {
        int len = phoneNumber.length();
        if (len != 11) {
            return false;
        }

        char c = phoneNumber.charAt(0);
        if (c == '0') {
            return false;
        }

        for (int i = 1; i < phoneNumber.length(); i++) {
            char c1 = phoneNumber.charAt(i);
            if (!(c1 >= '0' && c1 <= '9')) {
                return false;
            }
        }
        return true;
    }

    //生成验证码
    //要求：长度为5
    // 由4位大写或者小写字母和1位数字组成，同一个字母可重复
    //数字可以出现在任意位置
    private static String getCode(){
        Random r = new Random();
        String yzm = "";
        for (int i = 0; i < 4; i++) {
            int a = r.nextInt(2);
            switch (a) {
                case 0 -> {
                    char c = (char)(r.nextInt(26)+65);
                    yzm = yzm +c;
                    break;
                }
                case 1 -> {
                    char c = (char)(r.nextInt(26)+97);
                    yzm = yzm +c;
                    break;
                }
            }
        }
        String temp = Integer.toString(r.nextInt(10));
        char c = temp.charAt(0);
        int index = r.nextInt(4);
        String start = yzm.substring(0,index);
        String end = yzm.substring(index);
        return start + c + end;
//        char temp = arr[index];
//        arr[index] = arr[arr.lenght - 1];
//        arr[arr.lenght - 1] = temp;
    }

    //检查手机号和身份证号是否一致
    public static boolean checkPersonID(ArrayList<User> list,String personID,String phoneNumber,int index) {
        String s_personID = list.get(index).getPersonID();
        String s_phoneNumber = list.get(index).getPhoneNumber();
        if (s_personID.equals(personID) && s_phoneNumber.equals(phoneNumber)) {
            return true;
        }
        return false;
    }
}
