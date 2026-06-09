package com.example.k_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 自定义的登录界面：认 JFrame 做爸爸
public class C_LoginFrame extends JFrame implements ActionListener {
    public C_LoginFrame() {
        // 1、设置窗口的标题
        this.setTitle("登录界面");
        // 2、设置窗口的大小
        this.setSize(400, 300);
        // 3、设置窗口的位置
        this.setLocationRelativeTo(null);
        // 4、设置窗口的关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init(); // 初始化这个窗口上的组件
    }

    private void init() {
        JButton btn = new JButton("登录");

        btn.addActionListener(this);

        JPanel panel = new JPanel();
        this.add(panel);

        panel.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "我被点击了");
    }
}
