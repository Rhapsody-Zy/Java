package com.bilibili.ui;

import com.bilibili.Util.CodeUtil;
import com.bilibili.domain.User;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    //创建一个集合存储正确的用户名和密码
    static ArrayList<User> allUsers = new ArrayList<>();
    static {
        allUsers.add(new User("zhouyi","0305"));
        allUsers.add(new User("周艺","0305"));
    }


    JButton login = new JButton();
    JButton register = new JButton();
    JLabel rightCode = new JLabel();

    JTextField username = new JTextField();
    JTextField password = new JTextField();
    JTextField code = new JTextField();


    public LoginJFrame() {
        //初始化界面
        initJFrame();

        //在这个界面中添加内容
        initView();

        //让当前界面显示出来
        this.setVisible(true);
    }

    public void initView() {
        //1. 添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("puzzlegame1.0\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("puzzlegame1.0\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("puzzlegame1.0\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //验证码的输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        String codeStr = CodeUtil.getCode();

        //设置内容
        rightCode.setText(codeStr);
        //位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        //添加到界面
        this.getContentPane().add(rightCode);

        //5.添加登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("puzzlegame1.0\\image\\login\\登录按钮.png"));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //6.添加注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("puzzlegame1.0\\image\\login\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame1.0\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);

        login.addMouseListener(this);
        register.addMouseListener(this);
        rightCode.addMouseListener(this);

    }


    public void initJFrame() {
        this.setSize(488, 430);//设置宽高
        this.setTitle("拼图游戏 V1.0登录");//设置标题
        this.setDefaultCloseOperation(3);//设置关闭模式
        this.setLocationRelativeTo(null);//居中
        this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消内部默认布局
    }


    //要展示用户名或密码错误
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //鼠标单击
        Object source = e.getSource();
        System.out.println("点击登录");
        if (source == login) {
            //获取输入框输入的账号密码和验证码
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            String codeInput = code.getText();

            //创建一个学生对象，存储键盘的录入结果
            User userInput = new User(usernameInput,passwordInput);

            //首先判断填写内容是否有空缺
            if (codeInput.isEmpty()) {
                showJDialog("验证码不能为空");
                System.out.println("验证码不能为空");
            } else if ((usernameInput.isEmpty()) || (passwordInput.isEmpty())) {
                showJDialog("账号密码不能为空");
                System.out.println("账号密码不能为空");
            }else if (!codeInput.equalsIgnoreCase(rightCode.getText())) {
                showJDialog("验证码错误");
                System.out.println("验证码错误");
            } else if (contains(userInput)) {
                System.out.println("密码正确，执行游戏操作");
                //关闭登录界面
                this.setVisible(false);
                //打开游戏界面
                new GameJFrame();
            }else {
                System.out.println("密码或验证码错误");
                showJDialog("账号或密码错误，请重新输入");
                username.setText("");
                password.setText("");
                this.getContentPane().repaint();

            }
        } else if (source == register) {
            System.out.println("打开注册界面");
            //this.setVisible(false);
            //new RegisterJFrame();

        } else if (source == rightCode) {
            System.out.println("重置验证码");
            String code = CodeUtil.getCode();
            rightCode.setText(code);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //鼠标按着不松
        Object source = e.getSource();
        if (source == login) {
            System.out.println("鼠标按着不松");
            login.setIcon(new ImageIcon("puzzlegame1.0\\image\\login\\登录按下.png"));
        } else if (source == register) {
            System.out.println("鼠标按着不松");
            register.setIcon(new ImageIcon("puzzlegame1.0\\image\\register\\注册按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //鼠标松开
        Object source = e.getSource();
        if (source == login) {
            System.out.println("鼠标松开");
            login.setIcon(new ImageIcon("puzzlegame1.0\\image\\login\\登录按钮.png"));
        } else if (source == register) {
            System.out.println("鼠标松开");
            register.setIcon(new ImageIcon("puzzlegame1.0\\image\\register\\注册按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //鼠标划入
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //鼠标划出
    }

    public boolean contains(User userInput) {
        for (int i = 0; i < allUsers.size(); i++) {
            User rightUser = allUsers.get(i);
            if (userInput.getName().equals(rightUser.getName()) && userInput.getPassword().equals(rightUser.getPassword())) {
                //账号密码正确，返回true
                return true;
            }
        }
        return false;
    }
}
