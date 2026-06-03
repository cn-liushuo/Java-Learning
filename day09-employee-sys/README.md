# 使用 AI 结合 GUI 编程实现一个人事管理系统

### 1、创建一个模块做这个项目。

employee-sys

### 2、分析项目的业务需求

- 提供一个登录和注册用户的界面。
- 提供一个人事信息的管理界面：展示全部员工信息，提供一个根据名称查询某个员工信息展示，添加员工信息，删除员工信息，修改员工信息。
- 分析项目的角色：
    - 登录用户：登录名称，密码。
    - 员工信息：ID，姓名，性别，年龄，电话，职位，入职时间，薪水，部门。
- 分析系统的界面：
    - 登录界面类：创建登录界面。
    - 信息管理界面类：创建管理界面。

### 3、结合 AI 开始开发：Cursor

- AI 帮我们生成一个登录界面
- AI 帮我们生成一个信息管理界面

### 4、正式开发

#### 4.1、 拿到登录界面的程序，并进行了修改

```java
package com.example.ui;

import javax.swing.*;
import java.awt.*;

// 自定义登录界面
public class LoginUI extends JFrame {
    private JTextField usernameField; // 用户名输入框
    private JPasswordField passwordField; // 密码输入框
    private JButton loginButton; // 登录按钮
    private JButton registerButton; // 注册按钮

    public LoginUI() {
        super("登录界面");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null); // 居中显示

        createAndShowGUI();
    }

    private void createAndShowGUI() {
        // 创建主窗口
        // 创建面板
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 240, 240));

        // 设置字体和颜色
        Font customFont = new Font("楷体", Font.BOLD, 18);
        Color primaryColor = new Color(66, 135, 245);
        Color secondaryColor = new Color(204, 204, 204); // 更浅的颜色用于注册按钮

        // 标题
        JLabel titleLabel = new JLabel("人事管理系统");
        titleLabel.setBounds(125, 30, 300, 30);
        titleLabel.setFont(new Font("楷体", Font.BOLD, 24));
        panel.add(titleLabel);

        // 用户名标签
        JLabel usernameLabel = new JLabel("用户名:");
        usernameLabel.setBounds(50, 100, 150, 30);
        usernameLabel.setFont(customFont);
        panel.add(usernameLabel);

        // 用户名输入框
        usernameField = new JTextField();
        usernameField.setBounds(160, 100, 190, 30);
        usernameField.setFont(customFont);
        panel.add(usernameField);

        // 密码标签
        JLabel passwordLabel = new JLabel("密  码:");
        passwordLabel.setBounds(50, 150, 150, 30);
        passwordLabel.setFont(customFont);
        panel.add(passwordLabel);

        // 密码输入框
        passwordField = new JPasswordField();
        passwordField.setBounds(160, 150, 190, 30);
        passwordField.setFont(customFont);
        panel.add(passwordField);

        // 登录按钮
        loginButton = new JButton("登  录");
        loginButton.setBounds(50, 200, 150, 30);
        loginButton.setFont(customFont);
        loginButton.setBackground(primaryColor);
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton);

        // 注册按钮
        registerButton = new JButton("注  册");
        registerButton.setBounds(200, 200, 150, 30);
        registerButton.setFont(customFont);
        registerButton.setBackground(secondaryColor);
        registerButton.setForeground(Color.BLACK);
        panel.add(registerButton);

        // 添加面板到窗口
        this.add(panel);
        this.setVisible(true);
    }
}
```

#### 4.2、定义了一个 App 的启动类

```java
public class App {
    public static void main(String[] args) {
        new LoginUI();
    }
}
```

#### 4.2、拿到管理信息的界面

提供一个人事信息的管理界面：展示全部员工信息，提供一个根据名称查询某个员工信息展示，添加员工信息，删除员工信息，修改员工信息。

AI 生成的原版代码：

```java
public class EmployeeManagerUI {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;
    private JTextField textFieldSearch;

    public static void main(String[] args) {
        EmployeeManagerUI windows = new EmployeeManagerUI();
        windows.frame.setVisible(true);
    }

    public EmployeeManagerUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        // 输入框和搜索按钮
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        textFieldSearch = new JTextField(20);
        JButton btnSearch = new JButton("搜索");
        JButton btnAdd = new JButton("添加");
        topPanel.add(textFieldSearch);
        topPanel.add(btnSearch);
        topPanel.add(btnAdd);

        // 创建表格模型
        model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "姓名", "职位", "部门"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // 设置所有单元格为不可编辑
            }
        };

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setRowHeight(30);

        // 添加数据到表格
        for (int i = 0; i < 20; i++) {
            model.addRow(new Object[]{i + 1, "员工" + (i + 1), "职位", +(i + 1), "部门" + (i + 1)});
        }

        // 右键菜单
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem editItem = new JMenuItem("编辑");
        JMenuItem deleteItem = new JMenuItem("删除");
        popupMenu.add(editItem);
        popupMenu.add(deleteItem);
        table.addMouseListener(new MouseAdapter() { // 使用 MouseAdapter 而不是 MouseListener
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) { // 检查是否为右键点击
                    int row = table.rowAtPoint(e.getPoint());
                    if (row >= 0) {
                        table.setRowSelectionInterval(row, row);
                        popupMenu.show(table, e.getX(), e.getY());
                    }
                }
            }
        });

        editItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                int id = (Integer) model.getValueAt(selectedRow, 0);
                JOptionPane.showMessageDialog(frame, "编辑 ID：" + id);
                // 这里可以添加编辑逻辑，比如打开一个新的对话框让用户修改数据
            }
        });

        deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    int id = (Integer) model.getValueAt(selectedRow, 0); // 假设ID在第一列
                    JOptionPane.showMessageDialog(frame, "删除 ID：" + id);
                    // 这里可以添加删除逻辑，比如冲模型中移除该行
                }
            }
        });

        // 搜索按钮监听器
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchValue = textFieldSearch.getText();
            }
        });

        // 添加按钮监听器
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 这里可以添加添加新员工的逻辑
            }
        });

        frame.getContentPane().add(topPanel, BorderLayout.NORTH);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}
```

**改造成自定义的信息管理界面。**

```java
package com.example.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.Date;

public class EmployeeManagerUI extends JFrame {
    private JFrame frame;
    private JTable table; // 表格
    private DefaultTableModel model; // 表格模型：封装表格数据的对象
    private JTextField nameTextFieldSearch; // 搜索输入框

    public EmployeeManagerUI() {
        frame = this;
        initialize();
        this.setVisible(true);
    }

    private void initialize() {
        this.setBounds(100, 100, 800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());

        // 输入框和搜索按钮
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        nameTextFieldSearch = new JTextField(20);
        JButton btnSearch = new JButton("搜索");
        JButton btnAdd = new JButton("添加");
        topPanel.add(nameTextFieldSearch);
        topPanel.add(btnSearch);
        topPanel.add(btnAdd);

        // 创建表格模型
        model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "姓名", "性别", "年龄", "电话", "职位", "入职日期", "薪水", "部门"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // 设置所有单元格为不可编辑
            }
        };

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setRowHeight(30);

        // 添加数据到表格
        for (int i = 0; i < 20; i++) {
            model.addRow(new Object[]{i + 1, "员工" + (i + 1), "男", 21, "12666666666", "java工程师", new Date().toLocaleString(), 30000, "部门" + (i + 1)});
        }

        // 右键菜单
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem editItem = new JMenuItem("编辑");
        JMenuItem deleteItem = new JMenuItem("删除");
        popupMenu.add(editItem);
        popupMenu.add(deleteItem);
        table.addMouseListener(new MouseAdapter() { // 使用 MouseAdapter 而不是 MouseListener
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) { // 检查是否为右键点击
                    int row = table.rowAtPoint(e.getPoint());
                    if (row >= 0) {
                        table.setRowSelectionInterval(row, row);
                        popupMenu.show(table, e.getX(), e.getY());
                    }
                }
            }
        });

        editItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                int id = (Integer) model.getValueAt(selectedRow, 0);
                JOptionPane.showMessageDialog(frame, "编辑 ID：" + id);
                // 这里可以添加编辑逻辑，比如打开一个新的对话框让用户修改数据
            }
        });

        deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    int id = (Integer) model.getValueAt(selectedRow, 0); // 假设ID在第一列
                    JOptionPane.showMessageDialog(frame, "删除 ID：" + id);
                    // 这里可以添加删除逻辑，比如冲模型中移除该行
                }
            }
        });

        // 搜索按钮监听器
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchValue = nameTextFieldSearch.getText();
            }
        });

        // 添加按钮监听器
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 这里可以添加添加新员工的逻辑
            }
        });

        this.getContentPane().add(topPanel, BorderLayout.NORTH);
        this.getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}
```

#### 4.3、准备系统的角色类

- 用户类，员工信息类。