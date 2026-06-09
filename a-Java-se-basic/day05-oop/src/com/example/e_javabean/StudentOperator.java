package com.example.e_javabean;

public class StudentOperator {
    // 必须要拿到要处理的学生对象
    private Student s; // 用于记住将来要操作的学生对象。 null

    public StudentOperator(Student s) {
        this.s = s;
    }

    // 提供方法：打印学生的总成绩
    public void printTotalScore() {
        System.out.println(s.getName() + "的总成绩是" + (s.getChinese() + s.getMath()));
    }

    // 提供方法：打印学生的平均成绩
    public void printAverageScore() {
        System.out.println(s.getName() + "的平均成绩是" + (s.getChinese() + s.getMath()) / 2);
    }
}
