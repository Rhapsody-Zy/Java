package com.bilibili.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener , ActionListener {

    //创建二维数组
    //管理数据 用来加载数据
    int[][] data = new int[4][4];

    //存放图片的应用路径
    String path = "puzzlegame1.0\\image\\girl\\girl3\\";

    //定义一个win的二维数组
    int[][] win = new int[][] {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //定义一个计数器，统计步数
    int step = 0;

    //创建下拉选项
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("退出游戏");

    JMenuItem accountItem = new JMenuItem("联系方式");

    JMenuItem beautyItem = new JMenuItem("妹妹");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");


    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据（打乱）
        initData();

        //初始化图片
        initImage();

        //界面默认隐藏 setVisible - 使其显示出来,需要放在最后
        this.setVisible(true);
    }

    int x = 0;
    int y = 0;

    //初始化数据（打乱）
    private void initData() {
        //1.创建一个一维数组
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //2.打乱一维数组
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        //3.将一维数组添加到二维数组中
        for (int i = 0; i < tempArr.length; i++) {
            //记录空白方块在二维数组的位置
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片
    //按照二维数组中的数据进行添加图片
    private void initImage() {

        //删除所以已经出现的图片，重新加载
        this.getContentPane().removeAll();

        //加载胜利图标
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("puzzlegame1.0\\image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }

        //添加步数的显示
        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        //添加拼图
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                int num = data[i][j];
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(path + num+".jpg"));
                //指定图片的位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105,105);
                //设置边框
                //0 - 图片凸起来
                //1 - 凹下去
                jLabel.setBorder(new BevelBorder(1));
                //先添加到隐藏的容器当中
                this.getContentPane().add(jLabel);
            }
        }

        //先加载的图片在上方，后加载的图片在下方

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame1.0\\image\\background.png"));
        background.setBounds(40,40,508,560);
        //将背景图片添加到界面当中
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();
    }

    //初始化菜单
    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上的选项（功能 关于我们 更换图片）
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu changeJMenu = new JMenu("更换图片");

        //将下拉选项添加到选项中
        //如果在菜单中需要嵌套二级菜单，那么可以用JMenu完成，JMenu中时可以添加其他JMenu的
        functionJMenu.add(changeJMenu);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        changeJMenu.add(beautyItem);
        changeJMenu.add(animalItem);
        changeJMenu.add(sportItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        reLoginItem.addActionListener(this);

        beautyItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);

        //将选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化界面
    private void initJFrame() {
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

        //给界面添加一个键盘录入的监听
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame1.0\\image\\background.png"));
            background.setBounds(40,40,508,560);
            //将背景图片添加到界面当中
            this.getContentPane().add(background);

            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            return;
        }
        int code = e.getKeyCode();
        if (code == 37) {
            if (y == 3) {
                return;
            }
            System.out.println("向左移动");
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y++;
            step++;
            initImage();
        }else if (code == 38) {
            if (x == 3) {
                return;
            }
            System.out.println("向上移动");
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            x++;
            step++;
            initImage();
        }else if (code == 39) {
            if (y == 0) {
                return;
            }
            System.out.println("向右移动");
            data[x][y] = data[x][y-1];
            data[x][y-1] = 0;
            y--;
            step++;
            initImage();
        }else if (code == 40) {
            if (x == 0) {
                return;
            }
            System.out.println("向下移动");
            data[x][y] = data[x-1][y];
            data[x-1][y] = 0;
            x--;
            step++;
            initImage();
        }else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][] {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();

        }
    }
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == replayItem) {
            System.out.println("重新游戏");
            //重新打乱数据
            initData();
            //重置计数器
            step = 0;
            //重新加载界面
            initImage();

        } else if (source == reLoginItem) {
            System.out.println("重新登录");
            //关闭当前游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();

        } else if (source == closeItem) {
            System.out.println("退出游戏");
            System.exit(0);
        } else if (source == accountItem) {
            System.out.println("联系方式");
            //创建一个弹窗对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器JLabel
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame1.0\\image\\about.jpg"));
            //设置位置和宽高
            jLabel.setBounds(0,0,750,750);
            //将图片添加到弹窗中
            jDialog.getContentPane().add(jLabel);
            //设置弹窗大小
            jDialog.setSize(800,800);
            //弹窗置顶
            jDialog.setAlwaysOnTop(true);
            //弹窗居中
            jDialog.setLocationRelativeTo(null);
            //弹窗不关闭则无法操作下面操作
            jDialog.setModal(true);
            //设置弹窗显示
            jDialog.setVisible(true);
        } else if (source == beautyItem) {
            System.out.println("切换成妹妹");
            //生成随机索引
            Random r = new Random();
            int index = r.nextInt(1,13);
            //修改path
            path = "puzzlegame1.0\\image\\girl\\girl" + index + "\\";
            //设置重新开始
            step = 0;
            initData();
            initImage();
            //刷新界面
            this.getContentPane().repaint();
        } else if (source == animalItem) {
            System.out.println("切换成动物");
            //生成随机索引
            Random r = new Random();
            int index = r.nextInt(1,9);
            //修改path
            path = "puzzlegame1.0\\image\\animal\\animal" + index + "\\";
            //设置重新开始
            step = 0;
            initData();
            initImage();
            //刷新界面
            this.getContentPane().repaint();
        } else if (source == sportItem) {
            System.out.println("切换成运动");
            //生成随机索引
            Random r = new Random();
            int index = r.nextInt(1,9);
            //修改path
            path = "puzzlegame1.0\\image\\sport\\sport" + index + "\\";
            //设置重新开始
            step = 0;
            initData();
            initImage();
            //刷新界面
            this.getContentPane().repaint();
        }
    }
}
