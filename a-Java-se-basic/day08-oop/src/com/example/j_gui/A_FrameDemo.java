package com.example.j_gui;

import javax.swing.*;

public class A_FrameDemo {
    public static void main(String[] args) {
        // 目标：快速入门一下 GUI Swing 的编程
        // 1、创建一个窗口，有一个登录按钮
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel(); // 创建一个面板
        jf.add(panel); // 将面板添加到窗口中

        jf.setSize(400, 300); // 设置窗口大小
        jf.setLocationRelativeTo(null); // 设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭窗口的默认操作：关闭窗口退出程序

        JButton jb = new JButton("登录"); // 创建一个按钮
        panel.add(jb); // 将按钮添加到面板中

        jf.setVisible(true); // 显示窗口
    }
}
