package com.example.i_interface;

public class B_ClassDataInterImpl implements ClassDataInter {
    private Student[] students; // 记住送进来的全班学生对象信息

    public B_ClassDataInterImpl(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        System.out.println("学生信息如下");
        int maleCount = 0; // 男生人数
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + " " + s.getSex() + " " + s.getScore());
            if (s.getSex() == '男') {
                maleCount++;
            }
        }
        System.out.println("男学生人数：" + maleCount);
        System.out.println("女学生人数：" + (students.length - maleCount));
    }

    // 实现打印平局分(去掉最高分和最低分)
    @Override
    public void printAverageScore() {
        System.out.println("平均分如下");
        Student s1 = students[0];
        double sum = s1.getScore();
        double max = s1.getScore();
        double min = s1.getScore();
        for (int i = 1; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();

            if (s.getScore() > max) {
                max = s.getScore();
            }

            if (s.getScore() < min) {
                min = s.getScore();
            }
        }

        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + (sum - max - min) / (students.length - 2));
    }
}
