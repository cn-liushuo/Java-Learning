package com.example.k_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class A_Test {
    public static void main(String[] args) {
        // 目标：认识 GUI 的事件处理机制。
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel(); // 创建一个面板
        jf.add(panel); // 将面板添加到窗口中

        jf.setSize(400, 300); // 设置窗口大小
        jf.setLocationRelativeTo(null); // 设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭窗口的默认操作：关闭窗口退出程序

        JButton jb = new JButton("登录"); // 创建一个按钮
        panel.add(jb); // 将按钮添加到面板中

        // 给按钮绑定点击事件监听器对象
        // 第二种写法：直接俄使用匿名内部类的对象，代表事件监听对象
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 一旦点击 jb 按钮，底层触发这个方法执行
                // e 是事件对象，封装了事件的相关信息。
                JOptionPane.showMessageDialog(jf, "有人点击了登录");
            }
        });

        // 需求：监听用户键盘上下左右四个按键的事件。
        // 给 jf 窗口整体绑定按键事件。
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 获取键盘按键的编码
                int keyCode = e.getKeyCode(); // 拿事件源头的键帽编号
                System.out.println("keyCode：" + keyCode);
                // 判断按键编码是否是上、下、左、右
                if (keyCode == KeyEvent.VK_UP) {
                    System.out.println("用户点击了上");
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    System.out.println("用户点击了下");
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    System.out.println("用户点击了左");
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    System.out.println("用户点击了右");
                }
            }
        });

        jf.setVisible(true); // 显示窗口

        // 让窗口成为焦点。
        jf.requestFocus();
    }
}
