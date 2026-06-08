package com.example;

import javax.swing.*;
import java.util.ArrayList;

// 自定义窗口类，创建对象，展示一个主窗口。
public class MainFrame extends JFrame {
    // 设置图片位置
    private static final String imagePath = "day09-stone-maze/src/image/";
    // 准备一个数组，用于存储数字色块的行列位置：4行4列
    private int[][] imageData = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    public MainFrame() {
        // 1、调用一个初始化方法：初始化窗口大小等信息。
        initFrame();
        // 2、初始化界面：展示数字色块。
        initImage();
        // 3、初始化系统菜单：展示点击弹出菜单信息是系统退出，重启游戏
        initMenu();

        // 设置窗口的显示
        this.setVisible(true);
    }

    private void initMenu() {
        JMenuBar menuBar = new JMenuBar(); // 创建一个菜单调
        JMenu menu = new JMenu("系统"); // 创建一个菜单
        JMenuItem exitJi = new JMenuItem("退出");
        menu.add(exitJi); // 添加一个菜单项
        exitJi.addActionListener(e -> {
            dispose(); // 销毁
        });
        // 添加一个菜单，重启
        JMenuItem restartJi = new JMenuItem("重启");
        menu.add(restartJi);
        restartJi.addActionListener(e -> {
            // 重启游戏。
        });
        menuBar.add(menu); // 添加到菜单条中
        this.setJMenuBar(menuBar);
    }

    private void initImage() {
        // 1、展示一个行列矩阵的图片色块依次铺满窗口(4 * 4)
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                // 拿到图片的名称
                String imageName = imageData[i][j] + ".png";
                // 2、创建一个 JLabel 对象，设置图片展示
                JLabel label = new JLabel();
                // 3、设置图片
                label.setIcon(new ImageIcon(imagePath + imageName));
                // 4、设置图片位置
                label.setBounds(20 + j * 100, 60 + i * 100, 100, 100);
                // 5、需要把图片展示到窗口上去
                this.add(label);
            }
        }

        // 设置窗口的背景图片
        JLabel background = new JLabel(new ImageIcon(imagePath + "background.png"));
        background.setBounds(0, 0, 450, 484);
        this.add(background);
    }

    private void initFrame() {
        // 设置窗口的标题
        this.setTitle("石子迷阵 V 1.0 ls");
        // 设置窗口的宽高
        this.setSize(465, 575);
        // 设置窗口的关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口的居中显示
        this.setLocationRelativeTo(null);
        // 设置布局方式为绝对位置定位
        this.setLayout(null);
    }
}
