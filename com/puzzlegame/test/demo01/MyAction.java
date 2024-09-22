package com.bilibili.test.demo01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyAction extends JFrame implements ActionListener {

    JButton jbt1 = new JButton("点我");
    JButton jbt2 = new JButton("再点我");

    public MyAction() {
        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照xy轴的形式添加组件
        this.setLayout(null);

        jbt1.setBounds(0,0,100,50);
        jbt1.addActionListener(this);

        jbt2.setBounds(100,0,100,50);
        jbt2.addActionListener(this);

        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);


        //界面默认隐藏 setVisible - 使其显示出来,需要放在最后
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == jbt1) {
            jbt1.setSize(200,200);
        }else if (source == jbt2) {
            Random r = new Random();
            jbt2.setBounds(r.nextInt(500),r.nextInt(500),100,50);
        }
    }
}
