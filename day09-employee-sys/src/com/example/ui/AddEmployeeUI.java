package com.example.ui;

import com.example.bean.Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployeeUI extends JFrame implements ActionListener {
    private JTextField txtId, txtName, txtSex, txtAge, txtPhone, txtPosition, txtSalary, txtDepartment;
    private JTextField txtEntryDate;
    private JButton btnAdd, btnCancel;
    private DefaultTableModel model;
    private Font labelFont = new Font("Arial", Font.PLAIN, 14);

    public AddEmployeeUI(DefaultTableModel model) {
        super("添加员工信息");
        this.model = model;
        initUI();

        setSize(400, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void initUI() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // 第一行：ID
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(lbl("ID:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtId = new JTextField(15);
        add(txtId, gbc);

        // 第二行：姓名
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(lbl("姓名:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtName = new JTextField(15);
        add(txtName, gbc);

        // 第三行：性别
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        add(lbl("性别:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtSex = new JTextField(15);
        add(txtSex, gbc);

        // 第四行：年龄
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        add(lbl("年龄:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtAge = new JTextField(15);
        add(txtAge, gbc);

        // 第五行：电话
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        add(lbl("电话:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtPhone = new JTextField(15);
        add(txtPhone, gbc);

        // 第六行：职位
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.EAST;
        add(lbl("职位:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtPosition = new JTextField(15);
        add(txtPosition, gbc);

        // 第七行：入职日期
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.EAST;
        add(lbl("入职日期:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtEntryDate = new JTextField(15);
        add(txtEntryDate, gbc);

        // 第八行：薪水
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.EAST;
        add(lbl("薪水:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtSalary = new JTextField(15);
        add(txtSalary, gbc);

        // 第九行：部门
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.EAST;
        add(lbl("部门:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        txtDepartment = new JTextField(15);
        add(txtDepartment, gbc);

        // 第十行：按钮
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        btnAdd = new JButton("添加");
        btnCancel = new JButton("取消");
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnCancel);

        btnAdd.addActionListener(this);
        btnCancel.addActionListener(this);

        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(buttonPanel, gbc);
    }

    // 创建一个带指定字体的 JLabel
    private JLabel lbl(String text) {
        JLabel label = new JLabel(text);
        label.setFont(labelFont);
        return label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            addEmployee();
        } else if (e.getSource() == btnCancel) {
            dispose();
        }
    }

    private void addEmployee() {
        try {
            int id = Integer.parseInt(txtId.getText().trim());
            String name = txtName.getText().trim();
            String sex = txtSex.getText().trim();
            int age = Integer.parseInt(txtAge.getText().trim());
            String phone = txtPhone.getText().trim();
            String position = txtPosition.getText().trim();
            String entryDate = txtEntryDate.getText().trim();
            double salary = Double.parseDouble(txtSalary.getText().trim());
            String department = txtDepartment.getText().trim();

            if (name.isEmpty() || sex.isEmpty() || phone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "姓名、性别、电话为必填项，请填写完整！");
                return;
            }

            Employee emp = new Employee(id, name, sex, age, phone, position, entryDate, salary, department);
            model.addRow(new Object[]{id, name, sex, age, phone, position, entryDate, salary, department});

            JOptionPane.showMessageDialog(this, "添加员工成功！");
            dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "请输入有效的数字格式！\nID 和年龄为整数，薪水为数字。");
        }
    }
}
