package com.example.object;

public class B_Test {
    public static void main(String[] args) {
        // 目标：创建学生对象，存储学生数据并操作学生数据
        Student s1 = new Student();
        s1.name = "波妞";
        s1.chinese = 100;
        s1.math = 100;
        s1.printAllScore();
        s1.printAverageScore();

        Student s2 = new Student();
        s2.name = "波仔";
        s2.chinese = 50;
        s2.math = 100;
        s2.printAllScore();
        s2.printAverageScore();
    }
}
