package com.example.e_lambda;

import com.example.d_innerclass.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class B_Lambda {
    public static void main(String[] args) {
        // 目标：用 lambda 表达式简化实际示例。
        test1();
        test2();
    }

    public static void test1() {
        Student[] students = new Student[6];
        students[0] = new Student("殷素素", 35, 171.5, '女');
        students[1] = new Student("杨幂", 28, 168.5, '女');
        students[2] = new Student("金毛狮王", 53, 181.5, '男');
        students[3] = new Student("刘嘉玲", 35, 172.5, '女');
        students[4] = new Student("小昭", 19, 165.5, '女');
        students[5] = new Student("赵敏", 27, 167.5, '女');

        // 需求：按照年龄升序排序，可以调用 sun 公司写好的 API 直接对数据进行排序。
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge(); // 按照年龄升序！
            }
        });

        // 简化1
        // Arrays.sort(students, (Student o1, Student o2) -> {
        //     return o1.getAge() - o2.getAge(); // 按照年龄升序！
        // });

        // 简化2
        // Arrays.sort(students, (o1, o2) -> {
        //     return o1.getAge() - o2.getAge(); // 按照年龄升序！
        // });

        // 简化3
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

        // 遍历数组中的学生对象开始输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }

    public static void test2() {
// 需求：创建一个登录窗口，窗口上只有一个登录按钮
        JFrame win = new JFrame("登录窗口");
        win.setSize(300, 200);
        win.setLocationRelativeTo(null); // 居中显示
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);

        // java 要求必须给这个按钮添加一个点击事件监听器对象，这样就可以监听用户的点击操作，就可以做出反应。
        // 开发中不是我们主动去写匿名内部类，而是用别人的功能的时候，别人可以让我们写一个匿名内部类，我们才会写！
        // btn.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println("登录成功！");
        //     }
        // });

        // 简化1
        // btn.addActionListener((ActionEvent e) -> {
        //         System.out.println("登录成功！");
        // });

        // 简化2
        // btn.addActionListener((e) -> {
        //     System.out.println("登录成功！");
        // });

        // 简化3
        // btn.addActionListener(e -> {
        //     System.out.println("登录成功！");
        // });

        // 简化4
        btn.addActionListener(e -> System.out.println("登录成功！"));

        win.setVisible(true);
    }
}
