package com.bilibili.test.demo01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(600,700);
        //设置界面的标题
        jFrame.setTitle("事件演示");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置游戏关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照xy轴的形式添加组件
        jFrame.setLayout(null);

        JButton jbt = new JButton("点我");
        jbt.setSize(100,50);
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你点我？");
            }
        });

        jFrame.getContentPane().add(jbt);


        jFrame.setVisible(true);

    }

}
