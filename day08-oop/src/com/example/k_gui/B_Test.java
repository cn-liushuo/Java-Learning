package com.example.k_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B_Test {
    public static void main(String[] args) {
        // 第一种写法：提供实现类：创建实现类对象代表事件监听器对象。
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel(); // 创建一个面板
        jf.add(panel); // 将面板添加到窗口中

        jf.setSize(400, 300); // 设置窗口大小
        jf.setLocationRelativeTo(null); // 设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭窗口的默认操作：关闭窗口退出程序

        JButton jb = new JButton("登录"); // 创建一个按钮
        panel.add(jb); // 将按钮添加到面板中

        jb.addActionListener(new MyActionListener(jf));

        jf.setVisible(true); // 显示窗口
    }
}

// 第一种写法：直接提供实现类，用于创建事件监听对象
class MyActionListener implements ActionListener {
    private JFrame jf;

    public MyActionListener(JFrame jf) {
        this.jf = jf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf, "有人点击了登录");
    }
}
