package com.example.c_genericity;

public class C_GenericDemo {
    public static void main(String[] args) {
        // 目标：搞清楚泛型接口的基本作用
        // 需求：项目需要对学生数据/老师数据都要进行增删改查操作。
        StudentData studentData = new StudentData();
        studentData.add(new Student());
        studentData.delete(new Student());
        Student s = studentData.query(1);
    }
}
