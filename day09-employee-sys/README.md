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

```java
package com.example.bean;
// 用户信息包含用户名，密码，登录名。

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private String username; // 用户名
  private String password; // 密码
  private String loginName; // 登录名
}
```

```java
package com.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 员工信息："ID", "姓名", "性别", "年龄", "电话", "职位", "入职日期", "薪水", "部门"
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  private int id;
  private String name;
  private String sex;
  private int age;
  private String phone;
  private String position;
  private String entryDate;
  private double salary;
  private String department;
}
```

#### 4.4、开发登录功能。

系统中需要存在用户信息，大家可以先开发注册，注册一些用户信息(这个交给大家自己做)

可以在系统中直接准备一些用户对象，作为正确的用户信息。

准备一个集合容器，存储系统中全部的用户信息，这个集合只需要一个。

```java
// 定义一个静态的集合，存储系统中全部的用户对象信息。
private static ArrayList<User> allUsers = new ArrayList<>();

// 初始化几个测试的用户对象信息，作为登录用。
static {
  allUsers.add(new User("超级管理员", "123456", "admin"));
  allUsers.add(new User("赵敏", "wuji520", "minmin"));
  allUsers.add(new User("周杰伦", "jaychou", "jay"));
}
```

**开发步骤：**

1、给登录按钮绑定一个点击事件监听器

2、一旦点击登录按钮，拿到输入框输入的用户名和密码

3、去集合中看是否存在这个用户对象，如果认证通过，跳转到信息管理界面。登录失败，弹出提示。

```java
package com.example.ui;

import com.example.bean.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

// 自定义登录界面
public class LoginUI extends JFrame implements ActionListener {
  private JTextField loginNameField; // 用户名输入框
  private JPasswordField passwordField; // 密码输入框
  private JButton loginButton; // 登录按钮
  private JButton registerButton; // 注册按钮
  // 定义一个静态的集合，存储系统中全部的用户对象信息。
  private static ArrayList<User> allUsers = new ArrayList<>();

  // 初始化几个测试的用户对象信息，作为登录用。
  static {
    allUsers.add(new User("超级管理员", "123456", "admin"));
    allUsers.add(new User("赵敏", "wuji520", "minmin"));
    allUsers.add(new User("周杰伦", "jaychou", "jay"));
  }

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
    loginNameField = new JTextField();
    loginNameField.setBounds(160, 100, 190, 30);
    loginNameField.setFont(customFont);
    panel.add(loginNameField);

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
    loginButton.addActionListener(this);


    // 注册按钮
    registerButton = new JButton("注  册");
    registerButton.setBounds(200, 200, 150, 30);
    registerButton.setFont(customFont);
    registerButton.setBackground(secondaryColor);
    registerButton.setForeground(Color.BLACK);
    panel.add(registerButton);
    registerButton.addActionListener(this);

    // 添加面板到窗口
    this.add(panel);
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // 这里可能是登录按钮点击过来的，也可能是注册按钮点击过来的。
    // 判断到底是登录还是注册按钮点击的。
    JButton btn = (JButton) e.getSource();
    if (btn == loginButton) {
      // 独立功能独立成方法
      login();
    } else {
      System.out.println("注册");
    }
  }

  private void login() {
    // 1、获取用户的登录名和秘密
    String loginName = loginNameField.getText();
    String password = new String(passwordField.getPassword());
    // 2、遍历集合，判断用户输入的用户名和密码是否和集合中的对象匹配，匹配成功，则登录成功。
    // 3、根据登录名称去查询用户对象返回，查询用户对象，说明登录名称正确了。
    User user = getUserByLoginName(loginName);
    if (user != null) {
      // 4、判断密码是否正确
      if (user.getPassword().equals(password)) {
        // 登录成功
        System.out.println("登录成功!");
        // 跳转到员工管理界面
        new EmployeeManagerUI();
        this.dispose(); // 关闭当前登录界面
      } else {
        // 密码错误
        JOptionPane.showMessageDialog(this, "密码错误！");
      }
    } else {
      JOptionPane.showMessageDialog(this, "登录名称不存在！");
    }
  }

  // 根据登录名称去查询用户对象返回，查询用户对象，说明登录名称正确了。
  private User getUserByLoginName(String loginName) {
    for (int i = 0; i < allUsers.size(); i++) {
      User user = allUsers.get(i);
      if (user.getLoginName().equals(loginName)) {
        return user;
      }
    }
    return null; // 没有查询到用户对象，说明登录名称不正确。
  }
}
```

#### 5.5、完成信息管理界面的功能开发（核心功能）

1、登录成功后，把登录成功的用户名传给信息管理界面
2、添加员工信息的功能：

- 准备一个静态的集合，用于存储系统中全部的员工信息。
- 给添加按钮绑定点击事件
- 点击添加按钮后，弹出一个添加员工信息的输入框
- 把员工信息封装成一个员工对象，**存入到系统中去**，然后刷新表格，展示最新添加的数据。