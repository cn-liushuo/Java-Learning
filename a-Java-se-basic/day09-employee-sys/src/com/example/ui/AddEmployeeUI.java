package com.example.ui;

import com.example.bean.Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

// 添加员工信息的界面
public class AddEmployeeUI extends JFrame {
    private JTextField txtId, txtName, txtSex, txtAge, txtPhone, txtPosition, txtSalary, txtDepartment;
    private JTextField txtEntryDate;
    private JButton btnSave, btnCancel;
    private EmployeeManagerUI employeeManagerUI;

    // 初始化这个界面，提供很多输入框信息
    // "ID", "姓名", "性别", "年龄", "电话", "职位", "入职日期", "薪水", "部门"
    // 提供一个添加按钮，和一个取消按钮
    public AddEmployeeUI(EmployeeManagerUI employeeManagerUI) {
        super("添加员工信息");
        this.employeeManagerUI = employeeManagerUI;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // 内边距

        // 设置字体大小
        Font labelFont = new Font("楷体", Font.PLAIN, 14);

        // 标签和文本框
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jLabel = new JLabel("ID：");
        jLabel.setFont(labelFont);
        add(jLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtId = new JTextField(15);
        add(txtId, gbc);

        // 第二行：姓名
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jLabel2 = new JLabel("姓名：");
        jLabel2.setFont(labelFont);
        add(jLabel2, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtName = new JTextField(15);
        add(txtName, gbc);

        // 第三行：性别
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jLabel3 = new JLabel("性别：");
        jLabel3.setFont(labelFont);
        add(jLabel3, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtSex = new JTextField(15);
        add(txtSex, gbc);

        // 第四行：年龄
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jLabel4 = new JLabel("年龄：");
        jLabel4.setFont(labelFont);
        add(jLabel4, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtAge = new JTextField(15);
        add(txtAge, gbc);

        // 第五行：电话
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jLabel5 = new JLabel("电话：");
        jLabel5.setFont(labelFont);
        add(jLabel5, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtPhone = new JTextField(15);
        add(txtPhone, gbc);

        // 第六行：职位
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jLabel6 = new JLabel("职位：");
        jLabel6.setFont(labelFont);
        add(jLabel6, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtPosition = new JTextField(15);
        add(txtPosition, gbc);

        // 第七行：入职日期
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jLabel7 = new JLabel("入职日期：");
        jLabel7.setFont(labelFont);
        add(jLabel7, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtEntryDate = new JFormattedTextField(new SimpleDateFormat("yyyy-MM-dd"));
        add(txtEntryDate, gbc);

        // 第八行：薪水
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jLabel8 = new JLabel("薪水：");
        jLabel8.setFont(labelFont);
        add(jLabel8, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtSalary = new JTextField(15);
        add(txtSalary, gbc);

        // 第九行：部门
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel jLabel9 = new JLabel("部门：");
        jLabel9.setFont(labelFont);
        add(jLabel9, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtDepartment = new JTextField(10);
        add(txtDepartment, gbc);

        // 添加和取消按钮
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        btnSave = new JButton("添加");
        btnCancel = new JButton("取消");
        btnSave.setPreferredSize(new Dimension(100, 30));
        btnCancel.setPreferredSize(new Dimension(100, 30));
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSave);
        buttonPanel.add(btnCancel);
        add(buttonPanel, gbc);

        // 给添加员工信息绑定一个点击事件监听器
        btnSave.addActionListener(e -> {
            // 获取输入框的数据，封装成员工对象，添加到信息界面的集合并在其表格展示。

            Employee employee = new Employee();
            employee.setId(Integer.parseInt(txtId.getText()));
            employee.setName(txtName.getText());
            employee.setSex(txtSex.getText());
            employee.setAge(Integer.parseInt(txtAge.getText()));
            employee.setPhone(txtPhone.getText());
            employee.setPosition(txtPosition.getText());
            employee.setEntryDate(txtEntryDate.getText());
            employee.setSalary(Double.parseDouble(txtSalary.getText()));
            employee.setDepartment(txtDepartment.getText());
            // 把这个员工对象送到信息界面那里去，添加到信息界面的集合中，并在信息界面中展示。
            employeeManagerUI.addEmployee(employee);
            // 弹出一个提示成功的弹框
            JOptionPane.showMessageDialog(this, "添加成功！");
            // 关闭当前窗口。
            dispose();
        });

        // 设置窗口属性
        pack(); // 自动调整窗口大小以适应组件
        setSize(300, 400);
        setLocationRelativeTo(null); // 居中显示窗口
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
